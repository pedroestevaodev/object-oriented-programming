package br.com.classes.entities;

public class ContaInvestimento {
    private double saldo;
    private double taxaJuros;

    public ContaInvestimento(double saldoInicial, double taxaJuros) {
        this.saldo = saldoInicial;
        this.taxaJuros = taxaJuros;
    }

    public void adicionarJuros() {
        double juros = saldo * taxaJuros / 100;
        saldo += juros;
    }

    public double getSaldo() {
        return saldo;
    }
}
