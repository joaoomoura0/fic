package com.fic.demo.controller;

// Importa a anotação @Controller para definir a classe como um controlador Spring MVC
import org.springframework.stereotype.Controller;
// Importa a anotação @GetMapping para mapear requisições HTTP do tipo GET
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador responsável por exibir a página de login.
 * Quando o usuário acessar a rota "/login", o método mostrarLogin será executado,
 * retornando o nome do arquivo HTML da página de login.
 */
@Controller  // Informa ao Spring que essa classe é um controlador que lida com requisições web
public class LoginController {

    /**
     * Mapeia requisições GET para a URL "/login".
     * Ao acessar essa URL no navegador, será retornado o arquivo index.html localizado em:
     * src/main/resources/templates/index.html
     *
     * @return o nome do arquivo HTML (sem a extensão ".html") que deve ser renderizado
     */
    @GetMapping("/login")
    public String mostrarLogin() {
        return "index"; // Retorna o nome da página HTML que será renderizada (index.html)
    }
}
