package com.simple.controller;

import com.simple.dao.ReaderMapper;
import com.simple.pojo.Reader;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create By Simple4H
 * Date: 2019-04-08 14:51
 */
@RestController
@Slf4j
public class ReaderController {

    private final ReaderMapper readerMapper;

    public ReaderController(ReaderMapper readerMapper) {
        this.readerMapper = readerMapper;
    }

    @RequestMapping("/a")
    public Object getList() {
        List<Reader> lists = readerMapper.getAllReader();
        Map<Integer, Reader> map = lists.stream().collect(Collectors.toMap(Reader::getId, Function.identity()));
        List<Reader> objects = lists.stream().filter(s -> s.getId() == 1).collect(Collectors.toList());
        List<Integer> ids = lists.stream().map(Reader::getId).collect(Collectors.toList());
        List<String> userNames = lists.stream().map(Reader::getUsername).collect(Collectors.toList());
        List<String> ids2 = lists.stream().filter(s -> s.getId() != 1).map(Reader::getUsername).collect(Collectors.toList());
        log.error("ids2:{}", ids2);
        return ids2;
    }


    @RequestMapping(value = "download")
    public Object getExcel() throws IOException {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert servletRequestAttributes != null;
        HttpServletResponse response = servletRequestAttributes.getResponse();
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("统计表");
        createTitle(workbook, sheet);

        List<Reader> lists = (List<Reader>) readerMapper.getAllReader();

        //设置日期格式
        HSSFCellStyle style = workbook.createCellStyle();
        style.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));

        //新增数据行，并且设置单元格数据
        int rowNum = 1;
        for (Reader reader : lists) {

            HSSFRow row = sheet.createRow(rowNum);
            row.createCell(0).setCellValue(reader.getId());
            row.createCell(1).setCellValue(reader.getUsername());
            row.createCell(2).setCellValue(reader.getPassword());
            row.createCell(3).setCellValue(reader.getAge());
            row.createCell(4).setCellValue(reader.getSex());
            HSSFCell cell = row.createCell(5);
            cell.setCellValue(new Date());
            cell.setCellStyle(style);
            rowNum++;
        }

        //生成excel文件
        assert response != null;
        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=student.xlsx");

        //刷新缓冲
        response.flushBuffer();

        //workbook将Excel写入到response的输出流中，供页面下载
        workbook.write(response.getOutputStream());
        return "download.xlsx";
    }

    private void createTitle(HSSFWorkbook workbook, HSSFSheet sheet) {
        HSSFRow row = sheet.createRow(0);
        //设置列宽，setColumnWidth的第二个参数要乘以256，这个参数的单位是1/256个字符宽度
        sheet.setColumnWidth(2, 12 * 256);
        sheet.setColumnWidth(3, 17 * 256);

        //设置为居中加粗
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        font.setBold(true);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setFont(font);

        HSSFCell cell;
        cell = row.createCell(0);
        cell.setCellValue("序号");
        cell.setCellStyle(style);

        cell = row.createCell(1);
        cell.setCellValue("姓名");
        cell.setCellStyle(style);

        cell = row.createCell(2);
        cell.setCellValue("密码");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("年龄");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("性别");
        cell.setCellStyle(style);
    }
}
