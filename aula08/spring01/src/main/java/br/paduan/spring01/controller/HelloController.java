package br.paduan.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Olá Mundo!";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Olá Mundo Novamente!";
    }
}
