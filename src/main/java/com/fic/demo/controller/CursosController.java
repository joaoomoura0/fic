package com.fic.demo.controller;

import com.fic.demo.models.Curso;
import com.fic.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/cursos")
public class CursosController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public String listarCursos(Model model) {
        List<Curso> cursos = cursoService.listarCursos();
        model.addAttribute("cursos", cursos);
        return "cursos";
    }

    // AQUI ESTAVA O PROBLEMA! CORRIGIDO PARA @GetMapping
    @GetMapping("/novo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("curso", new Curso());
        return "form";
    }

    @PostMapping
    public String salvarCurso(@ModelAttribute Curso curso) {
        cursoService.salvarCurso(curso);
        return "redirect:/cursos";
    }





    // Método para exibir o formulário de edição de um curso existente
    @GetMapping("/editar/{id}")
    public String editarCurso(@PathVariable Integer id, Model model) {
        Optional<Curso> curso = cursoService.buscarPorId(id);
        if (curso.isPresent()) {
            model.addAttribute("curso", curso.get());
            return "form";
        } else {
            return "redirect:/cursos";
        }
    }

    // Método para excluir um curso pelo ID
    @GetMapping("/excluir/{id}")
    public String excluirCurso(@PathVariable Integer id) {
        cursoService.deletarCurso(id);
        return "redirect:/cursos";
    }

    // Método para exibir detalhes de um único curso (opcional)
    @GetMapping("/{id}")
    public String verDetalhesCurso(@PathVariable Integer id, Model model) {
        Optional<Curso> curso = cursoService.buscarPorId(id);
        if (curso.isPresent()) {
            model.addAttribute("curso", curso.get());
            return "detalhes"; // Você precisará criar a página detalhes.html
        } else {
            return "redirect:/cursos";
        }
    }
}