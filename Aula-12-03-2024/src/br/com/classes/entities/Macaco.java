package br.com.classes.entities;

public class Macaco {
    private String nome;
    private String bucho;

    public Macaco(String nome) {
        this.nome = nome;
        this.bucho = "";
    }

    public void comer(String alimento) {
        bucho += alimento + " ";
    }

    public void verBucho() {
        if (bucho.isEmpty()) {
            System.out.println("O bucho de "+nome+" está vazio");
        } else {
            System.out.println("O bucho de "+nome+" contém: "+bucho);
        }
    }

    public void digerir() {
        bucho = "";
        System.out.println("O macaco " + nome + " digeriu sua comida.");
    }
}
