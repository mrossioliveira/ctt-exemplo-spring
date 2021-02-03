package br.net.benfatto.exemplospring.services;

import org.springframework.stereotype.Service;

/**
 * @author Murilo Oliveira
 */
@Service
public class LivroService {

    public String findAll() {
        return "Lista de todos os livros do SERVICE";
    }

}
