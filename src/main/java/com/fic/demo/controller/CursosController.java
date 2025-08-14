package com.fic.demo.controller;

import com.fic.demo.models.Curso;
import com.fic.demo.models.CursoId;
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
        // CORREÇÃO: o método agora lida com a entidade Curso, não com CursoId
        List<Curso> cursos = cursoService.listarCursos();
        model.addAttribute("cursos", cursos);
        return "cursos";
    }

    @GetMapping("/novo")
    public String mostrarFormulario(Model model) {
        // CORREÇÃO: o formulário agora lida com um novo objeto Curso
        model.addAttribute("curso", new Curso());
        return "form";
    }

    @PostMapping
    public String salvarCurso(@ModelAttribute Curso curso) {
        // CORREÇÃO: o método agora recebe e salva a entidade Curso
        cursoService.salvarCurso(curso);
        return "redirect:/cursos";
    }

    // CORREÇÃO: O ID agora é composto por codCurso e versaoCurso
    @GetMapping("/editar/{codCurso}/{versaoCurso}")
    public String editarCurso(
            @PathVariable Integer codCurso,
            @PathVariable String versaoCurso,
            Model model
    ) {
        // CORREÇÃO: Cria a chave composta para a busca
        CursoId id = new CursoId();
        id.setCodCurso(codCurso);
        id.setVersaoCurso(versaoCurso);
        Optional<Curso> curso = cursoService.buscarPorId(id);

        if (curso.isPresent()) {
            model.addAttribute("curso", curso.get());
            return "form";
        } else {
            return "redirect:/cursos";
        }
    }

    // CORREÇÃO: O ID agora é composto por codCurso e versaoCurso
    @GetMapping("/excluir/{codCurso}/{versaoCurso}")
    public String excluirCurso(
            @PathVariable Integer codCurso,
            @PathVariable String versaoCurso
    ) {
        // CORREÇÃO: Cria a chave composta para a deleção
        CursoId id = new CursoId();
        id.setCodCurso(codCurso);
        id.setVersaoCurso(versaoCurso);
        cursoService.excluirCurso(id);
        return "redirect:/cursos";
    }

    // CORREÇÃO: O ID agora é composto por codCurso e versaoCurso
    @GetMapping("/{codCurso}/{versaoCurso}")
    public String verDetalhesCurso(
            @PathVariable Integer codCurso,
            @PathVariable String versaoCurso,
            Model model
    ) {
        // CORREÇÃO: Cria a chave composta para a busca
        CursoId id = new CursoId();
        id.setCodCurso(codCurso);
        id.setVersaoCurso(versaoCurso);
        Optional<Curso> curso = cursoService.buscarPorId(id);

        if (curso.isPresent()) {
            model.addAttribute("curso", curso.get());
            return "detalhes";
        } else {
            return "redirect:/cursos";
        }
    }
}