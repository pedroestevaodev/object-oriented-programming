package br.com.classes.entities;

public class Carro {
    private double consumoCombustivel;
    private double nivelCombustivel;

    public Carro(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
        this.nivelCombustivel = 0;
    }

    public void andar(double distancia) {
        double combustivelNecessario = distancia / consumoCombustivel;
        if (combustivelNecessario <= nivelCombustivel) {
            nivelCombustivel -= combustivelNecessario;
            System.out.println("Carro andou " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente para percorrer essa distância.");
        }
    }

    public double obterGasolina() {
        return nivelCombustivel;
    }

    public void adicionarGasolina(double litros) {
        nivelCombustivel += litros;
    }
}
