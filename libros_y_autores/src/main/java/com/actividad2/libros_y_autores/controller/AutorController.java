package com.actividad2.libros_y_autores.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actividad2.libros_y_autores.model.Autor;
import com.actividad2.libros_y_autores.service.AutorService;

@RestController
@RequestMapping("/api/v1/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    // Obtiene todos los autores
    @GetMapping
    public List<Autor> getAutores() {
        return autorService.listAll();
    }

    // Obtiene un único autor
    @GetMapping("/{id}")
    public Optional<Autor> getAutor(@PathVariable Long id) {
        return autorService.listOne(id);
    }

    // Crea un autor
    @PostMapping
    public Autor postAutor(@RequestBody Autor autor) {
        return autorService.crearAutor(autor);
    }
}
