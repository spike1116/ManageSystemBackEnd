package com.spike.backend.controller;

import com.spike.backend.mapper.BookMapper;
import com.spike.backend.model.Book;
import com.spike.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @PostMapping("/insert")
    public int saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PostMapping("/deleteById/{id}")
    public int deleteById(@PathVariable Integer id) {
        return bookService.deleteById(id);
    }

    @GetMapping("/page")
    public Map<String, Object> findByPage(@RequestParam Integer pageSize,
                                          @RequestParam Integer pageNum,@RequestParam String bookName) {
        return bookService.findByPage(pageSize, pageNum,bookName);
    }
}
