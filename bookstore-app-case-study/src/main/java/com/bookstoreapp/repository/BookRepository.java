package com.bookstoreapp.repository;

import com.bookstoreapp.model.Book;


import java.util.List;
import java.util.Optional;

public interface BookRepository {

    public List<Book> findAll();

    public Optional<Book> findById(int id);


    public Book save(Book book);


    public void deleteById(int id);


    public Book update(Book book);
}
