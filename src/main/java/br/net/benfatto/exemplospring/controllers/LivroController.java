package br.net.benfatto.exemplospring.controllers;

import br.net.benfatto.exemplospring.services.LivroService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Murilo Oliveira
 */
@RestController
public class LivroController {
    private final LivroService livroService;

    @Autowired
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/api/livros")
    public String findAll() {
        return this.livroService.findAll();
    }

}
