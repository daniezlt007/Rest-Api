package com.projectbuilders.restapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Table(name="cliente")
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="cpf")
    private String cpf;

    @Column(name="rg")
    private String rg;

    @Column(name="idade")
    private int idade;

    public Cliente() {

    }

    public Cliente(String nome, String cpf, String rg, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

    public Cliente(Long id, String nome, String cpf, String rg, int idade) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
