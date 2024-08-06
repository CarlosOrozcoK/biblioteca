package com.carlosorozco.webapp.biblioteca.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.carlosorozco.webapp.biblioteca.model.Categoria;
 
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
   
}
 