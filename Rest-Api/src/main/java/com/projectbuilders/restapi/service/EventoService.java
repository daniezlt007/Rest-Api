package com.projectbuilders.restapi.service;

import com.projectbuilders.restapi.model.Cliente;
import com.projectbuilders.restapi.model.EventoAppsFlyer;
import com.projectbuilders.restapi.repository.ClienteRepository;
import com.projectbuilders.restapi.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventoService implements EventoImplService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public EventoAppsFlyer save(EventoAppsFlyer eventoAppsFlyer) {
        return this.eventoRepository.save(eventoAppsFlyer);
    }

    @Override
    public void saveList() {
        List<Cliente> clientes = this.clienteRepository.findAll();
        List<EventoAppsFlyer> listaEventos = retornarListaAppsFlyer(clientes);
        for (int i = 0; i < listaEventos.size(); i++) {
            this.eventoRepository.save(listaEventos.get(i));
            System.out.println("Nome: " + listaEventos.get(i).getNomeEvento());
        }
    }

    private List<EventoAppsFlyer> retornarListaAppsFlyer(List<Cliente> clientes){
        List<EventoAppsFlyer> listaAppsFlyer = new ArrayList<>();
        EventoAppsFlyer eventoAppsFlyer ;
        for (int i = 0; i < clientes.size(); i++) {
            eventoAppsFlyer = new EventoAppsFlyer();
            eventoAppsFlyer.setNomeEvento(clientes.get(i).getNome());
            listaAppsFlyer.add(eventoAppsFlyer);
        }
        return listaAppsFlyer;
    }

}
