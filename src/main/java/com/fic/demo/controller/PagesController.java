package com.fic.demo.controller;

import com.fic.demo.models.Usuario;
import com.fic.demo.repositories.UsuarioRepository;
import com.fic.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PagesController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CursoService cursoService;

    @GetMapping("/home")
    public String home() {
        return "home"; // retorna home.html
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // retorna login.html
    }

    @GetMapping("/cadastro")
    public String mostrarFormularioCadastro() {
        return "cadastro"; // retorna cadastro.html
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(@RequestParam String username, @RequestParam String password) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        // CORREÇÃO: O método do modelo foi alterado para setPasswordHash
        usuario.setPasswordHash(passwordEncoder.encode(password));
        // CORREÇÃO: O método do modelo foi alterado para setTipoUsuario
        // O valor padrão no banco é 'usuario', mas você pode defini-lo explicitamente
        usuario.setTipoUsuario("usuario");
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }
}