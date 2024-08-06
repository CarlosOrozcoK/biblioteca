package com.carlosorozco.webapp.biblioteca.service;
 
import java.util.List;
 
import com.carlosorozco.webapp.biblioteca.model.Cliente;
 
public interface IClienteService {
 
    public List<Cliente> listarClientes();
 
    public Cliente guardarCliente(Cliente cliente);
 
    public Cliente buscarClientePordpi(Long dpi);
 
    public void eliminarCliente(Cliente cliente);
}