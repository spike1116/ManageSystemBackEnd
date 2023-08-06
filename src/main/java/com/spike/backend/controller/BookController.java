package com.spike.backend.controller;

import com.spike.backend.mapper.BookMapper;
import com.spike.backend.model.Book;
import com.spike.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @GetMapping("/all")
    public List<Book> findAll(){
        return bookMapper.findAll();
    }

    @PostMapping("/insert")
    public int saveBook(@RequestBody Book book){
        return bookMapper.saveBook(book);
    }

}
