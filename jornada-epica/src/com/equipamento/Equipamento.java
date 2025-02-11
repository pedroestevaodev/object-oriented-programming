package com.equipamento;

public abstract class Equipamento {
    private String nome;
    private String atributo;
    private int valorAtributo;

    public Equipamento(String nome, String atributo, int valorAtributo) {
        this.nome = nome;
        this.atributo = atributo;
        this.valorAtributo = valorAtributo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public int getValorAtributo() {
        return valorAtributo;
    }

    public void setValorAtributo(int valorAtributo) {
        this.valorAtributo = valorAtributo;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "nome='" + nome + '\'' +
                ", atributo='" + atributo + '\'' +
                ", valorAtributo=" + valorAtributo +
                '}';
    }
}
