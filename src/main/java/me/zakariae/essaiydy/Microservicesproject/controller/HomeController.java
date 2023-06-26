package me.zakariae.essaiydy.Microservicesproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping
    String Homepage(){
        return "hello World";
    }




}
