package com.personagem;

import com.equipamento.Equipamento;

import java.util.List;

public class Personagem {
    private String nome;
    private String genero;
    private String raca;
    private String classe;
    private String caracteristicas;
    private List<Equipamento> equipamento;

    public Personagem(String nome, String genero, String raca, String classe, String caracteristicas) {
        this.nome = nome;
        this.genero = genero;
        this.raca = raca;
        this.classe = classe;
        this.caracteristicas = caracteristicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public List<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }
}
