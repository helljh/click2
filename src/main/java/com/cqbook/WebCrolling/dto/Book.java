package com.cqbook.WebCrolling.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private String author;
    private String publish;
    private String imgUrl;
}
