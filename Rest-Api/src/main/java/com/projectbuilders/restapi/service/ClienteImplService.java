package com.projectbuilders.restapi.service;

import com.projectbuilders.restapi.model.Cliente;

import java.util.List;

public interface ClienteImplService {

    public Cliente save(Cliente cliente);
    public Cliente update(Cliente cliente);
    public void delete(Long id);
    public List<Cliente> getClients();
    public Cliente findById(Long id);

}
