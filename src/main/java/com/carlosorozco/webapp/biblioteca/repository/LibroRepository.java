package com.carlosorozco.webapp.biblioteca.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.carlosorozco.webapp.biblioteca.model.Libro;
 
public interface LibroRepository extends JpaRepository<Libro, Long> {
   
}
 