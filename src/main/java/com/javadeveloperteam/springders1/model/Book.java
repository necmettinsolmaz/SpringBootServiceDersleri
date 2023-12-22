package com.javadeveloperteam.springders1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id;
    private String name;
    private String author;
    private BigDecimal price;
}
