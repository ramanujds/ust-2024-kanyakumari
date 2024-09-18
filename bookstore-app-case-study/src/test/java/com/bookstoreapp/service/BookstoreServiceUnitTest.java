package com.bookstoreapp.service;

import com.bookstoreapp.exception.BookAlreadyExistsException;
import com.bookstoreapp.exception.BookNotFoundException;
import com.bookstoreapp.model.Book;
import com.bookstoreapp.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookstoreServiceUnitTest {

    @InjectMocks
    private BookstoreServiceImpl bookstoreService;

    @Mock
    private BookRepository bookRepository;


    // write test for getAllBooks()
    @Test
    public void testGetAllBooks() {

        // Given
        // create a list of books
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "The Alchemist", "Paulo Coelho", 1988, 156266262611L, 250.0));
        books.add(new Book(2, "The Great Gatsby", "F. Scott Fitzgerald", 1925, 156266262612L, 300.0));
        books.add(new Book(3, "The Kite Runner", "Khaled Hosseini", 2003, 156266262613L, 350.0));
        books.add(new Book(4, "The Little Prince", "Antoine de Saint-Exupery", 1943, 156266262614L, 400.0));

        // When
        // mock the repository
        when(bookRepository.findAll()).thenReturn(books);

        // Then
        // check if the result is equal to the expected result
        assertEquals(books, bookstoreService.getAllBooks());

        // check if the method is called only once
        verify(bookRepository, times(1)).findAll();


    }


    // write test for getBookById()
    @Test
    public void testGetBookById() {

        // Given
        // create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988, 156266262611L, 250.0);

        // When
        // mock the repository

        when(bookRepository.findById(1)).thenReturn(Optional.of(book));

        // Then
        // check if the result is equal to the expected result
        assertEquals(book, bookstoreService.getBookById(1));

        // check if the method is called only once
        verify(bookRepository, times(1)).findById(1);

    }


    // write test for saveBook()
    @Test
    public void testSaveBook() {

        // Given
        // create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988, 156266262611L, 250.0);

        // When
        // mock the repository
        when(bookRepository.findById(1)).thenReturn(Optional.empty());
        when(bookRepository.save(book)).thenReturn(book);

        // Then
        // check if the result is equal to the expected result
        assertEquals(book, bookstoreService.saveBook(book));

        // check if the method is called only once
        verify(bookRepository, times(1)).save(book);

    }

    // write test for updateBook()
    @Test
    public void testUpdateBook() {

        // Given
        // create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988, 156266262611L, 250.0);

        // When
        // mock the repository
        when(bookRepository.findById(1)).thenReturn(Optional.of(book));
        when(bookRepository.update(book)).thenReturn(book);


        // Then
        // check if the result is equal to the expected result
        assertEquals(book, bookstoreService.updateBook(1, book));

        // check if the method is called only once
        verify(bookRepository, times(1)).update(book);

    }

    // write test for deleteBook()
    @Test
    public void testDeleteBook() {

        // Given

        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988, 156266262611L, 250.0);


        // When
        // mock the repository
        doNothing().when(bookRepository).deleteById(1);
        when(bookRepository.findById(1)).thenReturn(Optional.of(book));

        // Then
        // check if the result is equal to the expected result
        assertDoesNotThrow(() -> {
            bookstoreService.deleteBook(1);
        });

        // check if the method is called only once
        verify(bookRepository, times(1)).deleteById(1);

    }

    // Write test for getBookById() when book is not found
    @Test
    public void testGetBookByIdWhenBookNotFound() {

        // Given


        // When
        // mock the repository
        when(bookRepository.findById(1)).thenReturn(Optional.empty());

        // Then
        // check if BookNotFoundException is thrown

        assertThrows(BookNotFoundException.class, () -> {
            bookstoreService.getBookById(1);
        });

        // check if the method is called only once
        verify(bookRepository, times(1)).findById(1);

    }

    // Write test for saveBook when book is already exists

    @Test
    public void testSaveBookWhenBookAlreadyExists() {

        // Given
        // create a book
        Book book = new Book(1, "The Alchemist", "Paulo Coelho", 1988, 156266262611L, 250.0);

        // When
        // mock the repository

        when(bookRepository.findById(1)).thenReturn(Optional.of(book));

        // Then
        // check if BookAlreadyExistsException is thrown
        assertThrows(BookAlreadyExistsException.class, () -> {
            bookstoreService.saveBook(book);
        });

        // check if the method is called only once
        verify(bookRepository, times(1)).findById(1);

    }


}
