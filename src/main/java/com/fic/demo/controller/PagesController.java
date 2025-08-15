package com.fic.demo.controller;

import com.fic.demo.models.Curso;
import com.fic.demo.models.CursoId;
import com.fic.demo.models.Usuario;
import com.fic.demo.repositories.UsuarioRepository;
import com.fic.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

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
        return "home"; // Retorna home.html
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login"; // Retorna login.html
    }

    @GetMapping("/cadastro")
    public String mostrarFormularioCadastro() {
        return "cadastro"; // Retorna cadastro.html
    }

    @PostMapping("/cadastro")
    public String cadastrarUsuario(@RequestParam String username, @RequestParam String password) {
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPasswordHash(passwordEncoder.encode(password));
        usuario.setTipoUsuario("usuario"); // Definindo o tipo de usuário como 'usuario'
        usuarioRepository.save(usuario);
        return "redirect:/login";
    }

    // O método foi atualizado para usar o nome "listarCursos" do seu CursoService
    @GetMapping("/cursos")
    public String listarCursos(Model model) {
        List<Curso> cursos = cursoService.listarCursos(); // Chama o método correto
        model.addAttribute("cursos", cursos);
        return "cursos"; // Retorna cursos.html
    }

    // O método foi atualizado para criar um objeto CursoId e usar os setters
    @GetMapping("/cursos/detalhe/{codCurso}/{versaoCurso}")
    public String visualizarCurso(
            @PathVariable("codCurso") Integer codCurso,
            @PathVariable("versaoCurso") String versaoCurso,
            Model model) {

        // Cria uma nova instância de CursoId usando o construtor padrão
        CursoId id = new CursoId();
        // Define os valores usando os métodos setters
        id.setCodCurso(codCurso);
        id.setVersaoCurso(versaoCurso);

        Optional<Curso> cursoOptional = cursoService.buscarPorId(id);

        if (cursoOptional.isPresent()) {
            model.addAttribute("curso", cursoOptional.get()); // Adiciona o curso ao modelo
            return "cursos-info"; // Retorna cursos-info.html
        } else {
            // Caso o curso não seja encontrado, redireciona para a lista
            return "redirect:/cursos";
        }
    }
}