package br.com.classes.entities;

public class Retangulo {
    private double largura;
    private double altura;
    private Ponto pontoInicial;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Retangulo(double largura, double altura, Ponto pontoInicial) {
        this.largura = largura;
        this.altura = altura;
        this.pontoInicial = pontoInicial;
    }

    public void mudarLados(double novaLargura, double novaAltura) {
        this.largura = novaLargura;
        this.altura = novaAltura;
    }

    public double retornarLargura() {
        return largura;
    }

    public double retornarAltura() {
        return altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public Ponto encontrarCentro() {
        double centroX = pontoInicial.getX() + largura / 2;
        double centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }
}
