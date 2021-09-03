package com.projectbuilders.restapi.controller;

import com.projectbuilders.restapi.model.Cliente;
import com.projectbuilders.restapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<?> getClients(){
        List<Cliente> list = this.clienteService.getClients();
        return !list.isEmpty() ? ResponseEntity.ok(list) : ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getClientById(@PathVariable("id") Long id){
        Cliente cliente = this.clienteService.findById(id);
        return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(this.clienteService.save(cliente), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> atualizar(@RequestBody Cliente cliente) {
        return new ResponseEntity<>(this.clienteService.save(cliente), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id){
        this.clienteService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
