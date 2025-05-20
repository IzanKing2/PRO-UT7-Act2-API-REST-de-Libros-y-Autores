package com.actividad2.libros_y_autores.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.actividad2.libros_y_autores.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Buscar por título parcial
    List<Libro> findByTituloContaining(String titulo, Sort sort);

    // Buscar por año exacto
    List<Libro> findByAnioPublicacion(int anio, Sort sort);

    // Buscar por título parcial y año
    List<Libro> findByTituloContainingAndAnioPublicacion(String titulo, int anio, Sort sort);
}