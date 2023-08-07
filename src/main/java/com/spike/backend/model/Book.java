package com.spike.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Book {

    private Integer id;

    private String book_name;

    private String book_author;

    private String book_category;

    private String book_publisher;
}
