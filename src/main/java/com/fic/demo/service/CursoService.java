package com.fic.demo.service;

import com.fic.demo.models.Curso;
import com.fic.demo.models.CursoId;
import com.fic.demo.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    // Injeta o repositório para acesso aos dados
    @Autowired
    private CursoRepository cursoRepository;

    /**
     * Salva ou atualiza um curso no banco de dados.
     * @param curso O objeto Curso a ser salvo.
     * @return O curso salvo.
     */
    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    /**
     * Retorna uma lista de todos os cursos.
     * @return Uma lista de objetos Curso.
     */
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    /**
     * Busca um curso pelo seu ID composto.
     * @param id O ID composto do curso (codCurso e versaoCurso).
     * @return Um Optional contendo o curso, se encontrado.
     */
    public Optional<Curso> buscarPorId(CursoId id) {
        return cursoRepository.findById(id);
    }

    /**
     * Exclui um curso do banco de dados pelo seu ID.
     * @param id O ID composto do curso a ser excluído.
     */
    public void excluirCurso(CursoId id) {
        cursoRepository.deleteById(id);
    }
}
