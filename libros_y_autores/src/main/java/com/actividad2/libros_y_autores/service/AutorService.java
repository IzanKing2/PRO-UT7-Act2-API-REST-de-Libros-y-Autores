package com.actividad2.libros_y_autores.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.actividad2.libros_y_autores.model.Autor;
import com.actividad2.libros_y_autores.repository.AutorRepository;

@Service
public class AutorService {

    private AutorRepository autorRepository;

    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> listAll() {
        return autorRepository.findAll();
    }

    // Obtiene un único autor por ID
    public Optional<Autor> listOne(Long id) {
        return autorRepository.findById(id);
    }

    // Crea un autor
    public Autor crearAutor(Autor autor) {
        return autorRepository.save(autor);
    }
}