package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookinventoryRepository bookinventoryRepository;

    @Autowired
    UserRepository userRepository;

    public void run(String... args){
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "9781524721251", "J. K. Rowling ", "Fantasy", "1997");

        Bookinventory isbn1251 = new Bookinventory("9781524721251", "10", true);
    }
}
