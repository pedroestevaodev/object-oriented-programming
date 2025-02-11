package br.com.classes.entities;

public class Quadrado {
    private double tamanhoLado;

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public void mudarLado(double novoTamanhoLado) {
        this.tamanhoLado = novoTamanhoLado;
    }

    public double retornarLado() {
        return tamanhoLado;
    }

    public double calcularArea() {
        return tamanhoLado * tamanhoLado;
    }
}
