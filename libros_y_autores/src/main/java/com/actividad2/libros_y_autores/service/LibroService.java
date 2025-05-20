package com.actividad2.libros_y_autores.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.actividad2.libros_y_autores.model.Libro;
import com.actividad2.libros_y_autores.repository.LibroRepository;

@Service
public class LibroService {
    
    private LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<Libro> listAll() { return libroRepository.findAll(); }
    public Optional<Libro> listOne(Long id) { return libroRepository.findById(id); }
    public Libro crearLibro(Libro libro) { return libroRepository.save(libro); } // Vincular a autor
    public Libro actualizarLibro(Libro libro, Long id) {
        libro.setId(id);
        return libroRepository.save(libro);
    }
    public void deleteLibro(Long id) { libroRepository.deleteById(id); }
    
    public List<Libro> buscarLibros(String titulo, Integer anioPublicacion, Sort sort) {
        if (titulo != null && !titulo.isEmpty() && anioPublicacion != null) {
            return libroRepository.findByTituloContainingAndAnioPublicacion(titulo, anioPublicacion, sort);
        } else if (titulo != null && !titulo.isEmpty()) {
            return libroRepository.findByTituloContaining(titulo, sort);
        } else if (anioPublicacion != null) {
            return libroRepository.findByAnioPublicacion(anioPublicacion, sort);
        } else {
            return libroRepository.findAll(sort);
        }
    }
}