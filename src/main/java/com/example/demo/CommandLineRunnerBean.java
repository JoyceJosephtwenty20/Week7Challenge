package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner{

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookinventoryRepository bookinventoryRepository;

    @Autowired
    UsersRepository usersRepository;

    public void run(String... args){
        Book book1 = new Book("Harry Potter and the Sorcerer's Stone", "9781524721251", "J. K. Rowling", "Fantasy", "1997");

        Bookinventory isbn1251 = new Bookinventory("9781524721251", 10, true);

        Users admin = new Users("admin", "ROLE_ADMIN", "admin", true);


        bookRepository.save(book1);
        bookinventoryRepository.save(isbn1251);
        usersRepository.save(admin);

        book1.setBookinventory(isbn1251);

        bookRepository.save(book1);

    }
}
