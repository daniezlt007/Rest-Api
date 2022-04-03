package com.projectbuilders.restapi.controller;

import com.projectbuilders.restapi.model.EventoAppsFlyer;
import com.projectbuilders.restapi.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class EventoScheduler {

    @Autowired
    private EventoService eventoService;

    @Scheduled(fixedDelay = 10000)
    public void executar() {
        eventoService.saveList();
        System.out.println("Executou o Scheduled com delay");
    }

}
