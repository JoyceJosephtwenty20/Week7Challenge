package com.example.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Book_Inventory")
public class Bookinventory {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(name="isbn")
    private long bookISBN;

    @Column(name = "quantity" )
    private long quantity;

    @Column(name="isinstock")
    private boolean bookInStock;

    @OneToMany(mappedBy = "bookinventory")
    private Set<Book> books;

    public Bookinventory() {
    }

    public Bookinventory(long bookISBN,
                         long quantity,
                         boolean bookInStock) {
        this.bookISBN = bookISBN;
        this.quantity = quantity;
        this.bookInStock = bookInStock;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(long bookISBN) {
        this.bookISBN = bookISBN;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public boolean isBookInStock() {
        return bookInStock;
    }

    public void setBookInStock(boolean bookInStock) {
        this.bookInStock = bookInStock;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
