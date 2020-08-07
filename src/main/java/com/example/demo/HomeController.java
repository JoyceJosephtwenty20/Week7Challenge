package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookinventoryRepository bookinventoryRepository;

    @Autowired
    UsersRepository usersRepository;


    @RequestMapping("/home")
    public String index(){
        return "index";
    }

    @RequestMapping("/bookform")
    public String booForm(Model model){
        model.addAttribute("book", new Book());
        return "addbook";
    }

    @PostMapping("/addbookprocess")
    public String processAddBook(@ModelAttribute Book book){
        bookRepository.save(book);
        return "redirect:/";
    }

}
