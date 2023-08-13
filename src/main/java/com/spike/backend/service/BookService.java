package com.spike.backend.service;

import com.spike.backend.mapper.BookMapper;
import com.spike.backend.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public int saveBook(Book book) {
        if (book.getId() == null) {
            return bookMapper.saveBook(book);
        } else {
            return bookMapper.updateBook(book);
        }
    }

    public int deleteById(Integer id) {
        return bookMapper.deleteById(id);
    }

    public Map<String, Object> findByPage(Integer pageSize, Integer pageNum,String bookName) {
        pageNum = (pageNum - 1) * pageSize;
        Map<String, Object> result = new HashMap<>();
        bookName="%"+bookName+"%";
        result.put("data", bookMapper.findByPage(pageNum, pageSize,bookName));
        result.put("total", bookMapper.findTotal(bookName));
        return result;
    }
}
