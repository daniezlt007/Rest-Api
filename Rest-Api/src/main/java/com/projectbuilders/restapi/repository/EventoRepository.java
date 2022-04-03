package com.projectbuilders.restapi.repository;

import com.projectbuilders.restapi.model.EventoAppsFlyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<EventoAppsFlyer, Long> {
}
