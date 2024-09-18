package com.bookstoreapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;


public class Book {


    private int id;
    // The title should not be empty and should not exceed 100 characters
    private String title;

    // The author should not be empty and should not exceed 200 characters
    private String author;

    // The publication year should be a valid year
    private int publicationYear;

    // The ISBN should be a valid 10- or 13-digit number.
    private long isbn;

    // The price should be a positive decimal value.
    private double price;

}
