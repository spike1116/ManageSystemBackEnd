package com.spike.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private int id;
    private String book_name;
    private String book_author;
    private String book_category;
    private String book_publisher;
}
