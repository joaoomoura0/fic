package com.fic.demo;

import com.fic.demo.models.Curso;
import com.fic.demo.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private CursoService cursoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Curso novoCurso = new Curso();
		// não precisa setar o codCurso se usar @GeneratedValue
		novoCurso.setVersaoCurso("v1");
		novoCurso.setDescCurso("Curso de Java");
		novoCurso.setCodAreaAtuacao(10);
		novoCurso.setCargaHoraria(40.0);
		novoCurso.setCodModalidadeDN(1);
		novoCurso.setCodPrecificacao(1);
		novoCurso.setValorCurso(500.0);
		novoCurso.setNovoValorCurso(450.0);

		cursoService.salvarCurso(novoCurso);

		System.out.println("Curso inserido com sucesso!");
	}
}

