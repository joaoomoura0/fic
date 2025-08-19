package com.fic.demo.controller;

import com.fic.demo.models.Curso;
import com.fic.demo.models.CursoId;
import com.fic.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

    @GetMapping("/editar/{codCurso}/{versaoCurso}")
    public String editarCurso(
            @PathVariable Integer codCurso,
            @PathVariable String versaoCurso,
            Model model
    ) {
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

    @GetMapping("/excluir/{codCurso}/{versaoCurso}")
    public String excluirCurso(
            @PathVariable Integer codCurso,
            @PathVariable String versaoCurso
    ) {
        CursoId id = new CursoId();
        id.setCodCurso(codCurso);
        id.setVersaoCurso(versaoCurso);
        cursoService.excluirCurso(id);
        return "redirect:/cursos";
    }

    // Método que retorna a página de detalhes (usando Thymeleaf)
    @GetMapping("/{codCurso}/{versaoCurso}")
    public String verDetalhesCurso(
            @PathVariable Integer codCurso,
            @PathVariable String versaoCurso,
            Model model
    ) {
        CursoId id = new CursoId();
        id.setCodCurso(codCurso);
        id.setVersaoCurso(versaoCurso);
        Optional<Curso> curso = cursoService.buscarPorId(id);

        if (curso.isPresent()) {
            model.addAttribute("curso", curso.get());
            return "detalhes"; // Retorna a página 'detalhes.html'
        } else {
            return "redirect:/cursos";
        }
    }


    // NOVO: Endpoint da API para o JavaScript
    // Retorna os dados do curso em formato JSON
    @GetMapping(value = "/api/{codCurso}/{versaoCurso}", produces = "application/json")
    @ResponseBody
    public Optional<Curso> getCursoApi(
            @PathVariable Integer codCurso,
            @PathVariable String versaoCurso
    ) {
        CursoId id = new CursoId();
        id.setCodCurso(codCurso);
        id.setVersaoCurso(versaoCurso);
        return cursoService.buscarPorId(id);
    }

    // Controlador REST aninhado para API
    @RestController
    @RequestMapping("/api/cursos")
    public class CursosApiController {

        // A injeção de dependência deve ser para a classe de serviço, não para o repositório
        private final CursoService cursoService;

        @Autowired
        public CursosApiController(CursoService cursoService) {
            this.cursoService = cursoService;
        }

        @GetMapping
        public Page<Curso> listarCursosPaginados(
                @RequestParam(defaultValue = "0") int page,
                @RequestParam(defaultValue = "8") int size
        ) {
            Pageable pageable = PageRequest.of(page, size);
            // CORRIGIDO: Agora chamando o método correto no serviço
            return cursoService.listarCursosPaginados(pageable);
        }
    }
}
