package com.simple;

import com.simple.util.EscapeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class StudyApplicationTests {


    @Test
    public void test() {

        MultiValueMap<Integer, List<Object>> map = new LinkedMultiValueMap<>();
        MultiValueMap<String, String> stringMultiValueMap = new LinkedMultiValueMap<>();


        List<Object> a1 = new ArrayList<>();
        a1.add("asdsad");
        a1.add("asdsad");
        a1.add("asdsad");
        a1.add("asdsad");
        a1.add("asdsad");
//        map.add(1, a1);
        a1.add("123");
        map.add(1, a1);
        List<Object> a2 = new ArrayList<>();
        a2.add("mmmmmmmm");
        map.add(2, a2);
        Set<Integer> keySet = map.keySet();
        List result = new ArrayList();
        for (Integer o : keySet) {
            List<Object> value = Collections.singletonList(map.get(o));
            System.out.println("key is:" + keySet + " values is:" + value);
        }


        stringMultiValueMap.add("早班 9:00-11:00", "周一");
        stringMultiValueMap.add("早班 9:00-11:00", "周二");
        stringMultiValueMap.add("中班 13:00-16:00", "周三");
        stringMultiValueMap.add("早班 9:00-11:00", "周四");
        stringMultiValueMap.add("测试1天2次 09:00 - 12:00", "周五");
        stringMultiValueMap.add("测试1天2次 09:00 - 12:00", "周六");
        stringMultiValueMap.add("中班 13:00-16:00", "周日");
//        打印所有值
        Set<String> keySet1 = stringMultiValueMap.keySet();
        for (String key : keySet1) {
            List<String> values = stringMultiValueMap.get(key);
            System.out.println("key is:" + key + " values is:" + values);

        }

    }

    @Test
    public void test2() {
        List<Integer> lists = new ArrayList<>();
        lists.add(10017);
        lists.add(10817);
        System.out.println(lists2String(lists));
    }

    @Test
    public void test3() {
        String s ="%" +"北京路" + "%";
        System.out.println(EscapeUtils.escapeSqlLike(s));


    }

    @Test
    public void test4() {
        Float a = 3.5F;

        log.error("result is :{}",Math.round(a));
    }


    private static String lists2String(List<Integer> list) {
        StringBuilder sb = new StringBuilder("(");
        for (Integer i : list) {
            sb.append(i).append(",");
        }
        String result = sb.substring(0, sb.length() - 1);
        return result + ")";
    }
}
