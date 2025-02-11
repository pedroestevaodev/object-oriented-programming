package br.com.classes.entities;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void envelhecer() {
        this.idade++;

        if (idade < 21) {
            this.altura += 0.5;
        }
    }

    public void engordar(double pesoGanho) {
        this.peso += pesoGanho;
    }

    public void emagrecer(double pesoPerdido) {
        this.peso -= pesoPerdido;
    }

    public void crescer(double alturaCrescida) {
        this.altura += alturaCrescida;
    }
}
