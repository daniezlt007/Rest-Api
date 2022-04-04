package com.projectbuilders.restapi.controller;

import com.projectbuilders.restapi.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/*
Cron Expression se resume em: <segundo> <minuto> <hora> <dia-do-mes> <mes> <ano>

0/30 * * * * * = 30 segundos
0 0/1 * * * *  = 1 minuto
0 0/5 * * * *  = 5 minutos
0 0/10 * * * * = 10 minutos
0 0/15 * * * * = 15 minutos
0 0 0/1 * * *  = 60 minutos
*/

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
