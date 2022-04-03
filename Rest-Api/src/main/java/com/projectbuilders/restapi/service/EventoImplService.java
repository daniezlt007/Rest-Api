package com.projectbuilders.restapi.service;

import com.projectbuilders.restapi.model.EventoAppsFlyer;

import java.util.List;

public interface EventoImplService {

    public EventoAppsFlyer save(EventoAppsFlyer eventoAppsFlyer);
    public void saveList();

}
