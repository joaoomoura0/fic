package com.fic.demo;

import com.fic.demo.models.cursos;
import com.fic.demo.service.cursoservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// Supondo que você tenha um EntityManager 'em' já criado e aberto
	cursoservice service = new cursoservice(em);

	cursos novoCurso = new cursos();
novoCurso.setCodCursos(1);
novoCurso.setVersaoCurso("v1");
novoCurso.setDescCurso("Curso de Java");
novoCurso.setCodAreaAtuacao(10);
novoCurso.setCargaHoraria(40.0);
novoCurso.setCodModalidadeDN(1);
novoCurso.setCodPrecificacao(1);
novoCurso.setValorCurso(500.0);
novoCurso.setNovoValorCurso(450.0);
service.inserirCurso(novoCurso);

}
