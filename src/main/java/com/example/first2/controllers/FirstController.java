package com.example.first2.controllers;

import com.example.first2.entities.NumRomano;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FirstController {

    @GetMapping()
    public String cumprimento() {
        return "Olá!";
    }

    @GetMapping("/{nome}")
    public String cumprimento(@PathVariable String nome) {
        return "Olá, " + nome;
    }

    @GetMapping("/Romano/{number}")
    public String romano(@PathVariable int number) {
        if (number < 4000) {
            return ("Numero romano: " + NumRomano.getRomano(number));
        } else {
            return ("Numero grande demais, favor inserir numero menor que 4000.");
        }
    }
}

