package com.spike.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {

    private Integer id;

    private String name;

    private String pwd;

    private Integer phone;
}
