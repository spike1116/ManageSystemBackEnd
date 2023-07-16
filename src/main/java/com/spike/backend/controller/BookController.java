package com.spike.backend.controller;

import com.spike.backend.mapper.BookMapper;
import com.spike.backend.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/")
public class BookController {

    @Autowired
    private BookMapper bookMapper;


    @GetMapping
    public List<Book> findAll(){
        return bookMapper.findAll();
    }
}
