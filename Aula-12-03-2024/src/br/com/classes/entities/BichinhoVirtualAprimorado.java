package br.com.classes.entities;

public class BichinhoVirtualAprimorado {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public BichinhoVirtualAprimorado(String nome) {
        this.nome = nome;
        this.fome = 0;
        this.saude = 100;
        this.idade = 0;
    }

    public void alimentar(int quantidadeComida) {
        fome -= quantidadeComida;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        saude += tempoBrincadeira;
        if (saude > 100) {
            saude = 100;
        }
    }

    public void mostrarValores() {
        System.out.println("Nome: " + nome);
        System.out.println("Fome: " + fome);
        System.out.println("Saúde: " + saude);
        System.out.println("Idade: " + idade);
    }
}
