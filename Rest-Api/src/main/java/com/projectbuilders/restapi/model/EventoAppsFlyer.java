package com.projectbuilders.restapi.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "evento_apps")
public class EventoAppsFlyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nome_evento")
    private String nomeEvento;
    @Column(name="data_hora_evento")
    private LocalDateTime dataHoraEvento;

}
