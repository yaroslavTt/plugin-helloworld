package com.techstack.tutorial.myPlugin.controller;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello-world")
    public ModelAndView greetPerson() {
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(SecurityContextHolder.getContext().getAuthentication().getCredentials().toString());
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
