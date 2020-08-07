package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    RoleRepository roleRepository;


    @RequestMapping("/home")
    public String index(){
        return "index";
    }



    @PostMapping("/processregister")
    public String processRegistrationPage(
            @Valid @ModelAttribute("user") Book book,
            BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("user", book);
            return "register";
        }
        else{
            model.addAttribute("user", book);
            bookRepository.save(book);
        }
        return "redirect:/";
    }


    @RequestMapping("/allbooks")
    private String listAllBooks(Model model){
        model.addAttribute("book", bookRepository.findAll());
        return "allbooks";
    }

    @RequestMapping("/viewemployees/{id}")
    private String listbyID(@PathVariable("id") long id, Model model){
        model.addAttribute("employee", bookRepository.findById(id).get());
        return "viewemployee";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/reg")
    public String loadRegistrationForm (Model model){
        model.addAttribute("newbook", new Book());
        return "userregistration";
    }

    @PostMapping("/userregistration")
    public String processUpdateFrom(@Valid Book book, BindingResult result)
    {
        if(result.hasErrors()){
            return "userregistration";
        }
        bookRepository.save(book);
        return "redirect:/";
    }

    @RequestMapping("/update/{id}")
    public String updateUser(@PathVariable("id")long id,Model model){

        model.addAttribute("employee", bookRepository.findById(id).get());
        return "userregistration";
    }

    @RequestMapping("/disableuser/{id}")
    public String disableEnable(@PathVariable("id") long id, Model model){
        Book book = bookRepository.findById(id).get();
        bookRepository.save(book);
        return "redirect:/";
    }

}


