package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    RoleRepository roleRepository;


    public void run(String... args){

        Book book1 = new Book("89987987", "Title",  true, "Test", "fiction", "1987");
        Role adminRole1 = new Role ("admin", "ROLE_ADMIN", "admin", "admin", "admin", true);


        bookRepository.save(book1);
        roleRepository.save(adminRole1);


    }
}
