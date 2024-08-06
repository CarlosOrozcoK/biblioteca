package com.carlosorozco.webapp.biblioteca.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.carlosorozco.webapp.biblioteca.model.Cliente;
 
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
   
}
 