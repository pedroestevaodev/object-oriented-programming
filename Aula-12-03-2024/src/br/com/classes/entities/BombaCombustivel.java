package br.com.classes.entities;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void abastecerPorValor(double valor) {
        double listrosAbastecidos = valor / valorLitro;
        quantidadeCombustivel -= listrosAbastecidos;
        System.out.println("Litros abastecidos: "+listrosAbastecidos);
    }

    public void abastecerPorLitro(double litros) {
        double valorPagar = litros * valorLitro;
        quantidadeCombustivel -= litros;
        System.out.println("Valor a pagar: R$"+valorPagar);
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(String novoCombustivel) {
        this.tipoCombustivel = novoCombustivel;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }
}
