package com.spike.backend.mapper;

import com.spike.backend.model.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("SELECT *  FROM book ")
    List<Book> findAll();

    @Insert("INSERT INTO book(book_name,book_author,book_category,book_publisher) " +
            "VALUES(#{book_name},#{book_author},#{book_category},#{book_publisher})")
    int saveBook(Book book);
}
