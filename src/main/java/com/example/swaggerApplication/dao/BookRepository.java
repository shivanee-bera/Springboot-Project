package com.example.swaggerApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swaggerApplication.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
