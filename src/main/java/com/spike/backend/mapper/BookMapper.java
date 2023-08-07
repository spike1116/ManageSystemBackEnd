package com.spike.backend.mapper;

import com.spike.backend.model.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface BookMapper {

    @Select("SELECT *  FROM book ")
    List<Book> findAll();

    @Insert("INSERT INTO book(book_name," +
            "book_author,book_category,book_publisher) " +
            "VALUES(#{book_name}," +
            "#{book_author},#{book_category}," +
            "#{book_publisher})")
    int saveBook(Book book);

    int updateBook(Book book);

    @Update("UPDATE book set is_deleted = 1 where id = #{id}")
    int deleteById(Integer id);
}
