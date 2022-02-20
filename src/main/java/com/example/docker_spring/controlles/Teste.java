package com.example.docker_spring.controlles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
public class Teste {
    
    @GetMapping
    public String teste2(){
        return "tudo bem?";
    }
}
