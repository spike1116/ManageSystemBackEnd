package com.spike.backend.mapper;

import com.spike.backend.model.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("SELECT *  FROM book ")
    List<Book> findAll();
}
