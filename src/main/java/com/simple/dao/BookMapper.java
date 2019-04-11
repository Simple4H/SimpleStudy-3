package com.simple.dao;

import com.simple.pojo.Book;

/**
 * Create By Simple4H
 * Date: 2019-04-11 11:45
 */
public interface BookMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
}