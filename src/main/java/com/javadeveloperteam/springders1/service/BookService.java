package com.javadeveloperteam.springders1.service;

import com.javadeveloperteam.springders1.dto.BookRequest;
import com.javadeveloperteam.springders1.dto.BookResponse;
import com.javadeveloperteam.springders1.model.Book;
import com.javadeveloperteam.springders1.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public void createBook(BookRequest bookRequest){
        Book book1 = Book.builder()
                        .name(bookRequest.getName())
                        .author(bookRequest.getAuthor())
                        .price(bookRequest.getPrice())
                        .build();
        bookRepository.save(book1);
        log.info("{} idli {} yazarın kitabı kaydedildi.", book1.getId(), book1.getAuthor());
    }
    public BookResponse getBook(String id){
        return bookRepository.findById(id)
                .map(book -> new BookResponse(
                        book.getId(),
                        book.getName(),
                        book.getAuthor(),
                        book.getPrice()
                )).orElse(null);

    }
    public List<BookResponse> getBooks(){
        List<Book> books  = bookRepository.findAll();
        return books.stream()
                .map(this::mapToBookResponse).toList();


    }
    private BookResponse mapToBookResponse(Book book) {
        return BookResponse.builder()
                .id(book.getId())
                .name(book.getName())
                .author(book.getAuthor())
                .price(book.getPrice())
                .build();
    }
}
