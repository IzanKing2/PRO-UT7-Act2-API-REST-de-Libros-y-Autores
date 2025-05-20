package com.actividad2.libros_y_autores.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.actividad2.libros_y_autores.model.Autor;
import com.actividad2.libros_y_autores.repository.AutorRepository;

@Service
public class AutorService {

    private AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> listAll() { return autorRepository.findAll(); }
    /* Añadir método ver autor con sus libros ... */
    public Autor createAutor(Autor autor) { return autorRepository.save(autor); }
}