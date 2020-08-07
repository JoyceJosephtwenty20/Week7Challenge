package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="Book_Database")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="title")
    private String bootTitle;

    @Column(name="isbn")
    private long bookISBN;

    @Column(name="author")
    private String bookAuthor;

    @Column(name="category")
    private String bookCategory;

    @Column(name="year")
    private String bookYear;


    private String bookThumbnail;

    public Book() {
    }

    @OneToOne
    private Book book;

    public Book(String bootTitle,
                long bookISBN,
                String bookAuthor,
                String bookCategory,
                String bookYear) {
        this.bootTitle = bootTitle;
        this.bookISBN = bookISBN;
        this.bookAuthor = bookAuthor;
        this.bookCategory = bookCategory;
        this.bookQuantity = bookQuantity;
        this.bookYear = bookYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBootTitle() {
        return bootTitle;
    }

    public void setBootTitle(String bootTitle) {
        this.bootTitle = bootTitle;
    }

    public long getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(long bookISBN) {
        this.bookISBN = bookISBN;
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

    public String getBookThumbnail() {
        return bookThumbnail;
    }

    public void setBookThumbnail(String bookThumbnail) {
        this.bookThumbnail = bookThumbnail;
    }
}
