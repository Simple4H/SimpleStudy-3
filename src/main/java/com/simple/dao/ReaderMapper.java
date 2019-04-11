package com.simple.dao;

import com.simple.pojo.Reader;

import java.util.List;

/**
 * Create By Simple4H
 * Date: 2019-04-11 11:46
 */
public interface ReaderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Reader record);

    int insertSelective(Reader record);

    Reader selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Reader record);

    int updateByPrimaryKey(Reader record);

    List<Reader> getAllReader();
}