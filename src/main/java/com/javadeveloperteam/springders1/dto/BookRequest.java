package com.javadeveloperteam.springders1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequest {
    private String name;
    private String author;
    private BigDecimal price;
}
