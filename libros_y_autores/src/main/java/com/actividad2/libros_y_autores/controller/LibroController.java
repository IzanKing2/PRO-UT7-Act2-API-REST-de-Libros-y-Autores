package com.actividad2.libros_y_autores.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.actividad2.libros_y_autores.model.Libro;
import com.actividad2.libros_y_autores.service.LibroService;


@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    private LibroService libroService;

    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    // Obtiene todos los libros
    @GetMapping
    public List<Libro> getLibros() { return libroService.listAll(); }

    // Obtiene un único libro
    @GetMapping("/{id}")
    public Optional<Libro> getLibro(@PathVariable Long id) { return libroService.listOne(id); } 

    // Crea un libro
    @PostMapping
    public Libro postLibro(@RequestBody Libro libro) { return libroService.crearLibro(libro); }

    // Modifica un libro
    @PutMapping("/{id}")
    public Libro putLibro(@RequestBody Libro libro, @PathVariable Long id) { return libroService.actualizarLibro(libro, id); }

    // Borra un libro
    @DeleteMapping("/{id}")
    public void deleteLibro(@PathVariable Long id) { libroService.deleteLibro(id); }

    @GetMapping("/buscar")
    public List<Libro> buscarLibro(
            @RequestParam(required = false) String titulo,
            @RequestParam(required = false) Integer anio,
            @RequestParam(required = false, defaultValue = "id") String sortBy,
            @RequestParam(required = false, defaultValue = "asc") String order) {
        Sort sort = order.equalsIgnoreCase("desc") ? Sort.by(sortBy).descending() : Sort.by(sortBy).ascending();
        return libroService.buscarLibros(titulo, anio, sort);
    }
}