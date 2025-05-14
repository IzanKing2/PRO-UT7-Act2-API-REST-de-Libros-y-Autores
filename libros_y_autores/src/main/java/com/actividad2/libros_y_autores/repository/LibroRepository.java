package com.actividad2.libros_y_autores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.actividad2.libros_y_autores.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> { }