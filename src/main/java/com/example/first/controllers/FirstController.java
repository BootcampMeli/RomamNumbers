package com.example.first.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

    @GetMapping()
    public String cumprimento(){
        return "Olá!";
    }

    @GetMapping("/{nome}")
    public String cumprimento(@PathVariable String nome){
        return "Olá, " + nome;
    }
}

