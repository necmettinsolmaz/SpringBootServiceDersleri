package com.javadeveloperteam.springders1.controller;

import com.javadeveloperteam.springders1.dto.BookRequest;
import com.javadeveloperteam.springders1.dto.BookResponse;
import com.javadeveloperteam.springders1.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @PostMapping()
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createBook(@RequestBody BookRequest bookRequest){
        bookService.createBook(bookRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BookResponse> getBooks(){
        return bookService.getBooks();
    }
    @GetMapping("/id")
    public BookResponse getBook(@RequestParam(value = "id") String id){
        return bookService.getBook(id);
    }
}
