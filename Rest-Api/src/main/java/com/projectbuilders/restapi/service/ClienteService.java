package com.projectbuilders.restapi.service;

import com.projectbuilders.restapi.model.Cliente;
import com.projectbuilders.restapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements ClienteImplService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente save(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        Cliente clienteAtualizado = this.findById(cliente.getId());
        if(clienteAtualizado != null){
            return this.clienteRepository.save(clienteAtualizado);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Cliente cliente = this.findById(id);
        if(cliente != null){
            this.clienteRepository.delete(cliente);
        }
    }

    @Override
    public List<Cliente> getClients() {
        List<Cliente> clientes = this.clienteRepository.findAll();
        return clientes;
    }

    @Override
    public Cliente findById(Long id) {
        Optional<Cliente> cliente = this.clienteRepository.findById(id);
        return cliente.isPresent() == false ? null : cliente.get();
    }
}
