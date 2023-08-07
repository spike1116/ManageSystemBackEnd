package com.spike.backend.service;

import com.spike.backend.mapper.BookMapper;
import com.spike.backend.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public int deleteById(Integer id){
        return  bookMapper.deleteById(id);
    }
}
