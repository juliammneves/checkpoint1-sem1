package br.com.fiap.checkpoint1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("ping")
public class pingController {
    
    @GetMapping()
    public String ping() {
        return "pong";
    }
}