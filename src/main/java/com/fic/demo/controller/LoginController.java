package com.fic.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/minhalogin")
    public String mostrarLogin() {
        return "login"; // Retorna o nome do arquivo login.html
    }
}
