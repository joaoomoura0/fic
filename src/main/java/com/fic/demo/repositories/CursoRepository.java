package com.fic.demo.repositories;

import com.fic.demo.models.Curso;
import com.fic.demo.models.CursoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interface de repositório para a entidade Curso.
 * Estende JpaRepository para fornecer operações CRUD padrão para a entidade Curso.
 * O primeiro parâmetro do JpaRepository é a entidade (Curso) e o segundo é o tipo do ID da entidade (CursoId).
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, CursoId> {
    // Spring Data JPA fornece automaticamente a implementação dos métodos CRUD,
    // como save(), findById(), findAll(), deleteById(), etc.
    // Não é necessário implementar nenhum método aqui, a menos que você precise
    // de consultas personalizadas.
}
