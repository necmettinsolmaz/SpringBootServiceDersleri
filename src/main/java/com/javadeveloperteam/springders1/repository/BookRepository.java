package com.javadeveloperteam.springders1.repository;

import com.javadeveloperteam.springders1.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String > {
}
