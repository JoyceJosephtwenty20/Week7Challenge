package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name="Book_Table")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "bookisbn")
    private String bookISBN;

    @Column(name = "bookTitle")
    private String bookTitle;

    @Column(name = "enabled")
    private boolean isInStock;

    @Column(name = "Author")
    private String bookAuthor;

    @Column(name = "category")
    private String bookCategory;

    @Column(name = "year")
    private String bookYear;


    private String headshot;

    public Book() {
    }

    public Book(String bookISBN, String bookTitle, boolean isInStock,
                String bookAuthor, String bookCategory, String bookYear) {
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.isInStock = isInStock;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookYear = bookYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }
}