package br.com.classes.entities;

public class FuncionarioAprimorado {
    private String nome;
    private double salario;

    public FuncionarioAprimorado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentualDeAumento) {
        salario += salario * porcentualDeAumento / 100;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
