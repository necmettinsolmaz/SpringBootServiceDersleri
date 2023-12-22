package com.javadeveloperteam.springders1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private String id;
    private String name;
    private String author;
    private BigDecimal price;
}
