package br.com.rayan.FirstProject.controllers;

import br.com.rayan.FirstProject.entities.RomanNumbers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FirstController {

    @GetMapping("/first/{nome}")
    public String firstController(@PathVariable String nome) {
        return "Olá " + nome + "!";
    }

    @GetMapping("/RomanNumber/{number}")
    public String romanNumber(@PathVariable int number) {
        return RomanNumbers.getRoman(number);
    }


}
