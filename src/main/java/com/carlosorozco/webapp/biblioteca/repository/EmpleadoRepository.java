package com.carlosorozco.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosorozco.webapp.biblioteca.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}