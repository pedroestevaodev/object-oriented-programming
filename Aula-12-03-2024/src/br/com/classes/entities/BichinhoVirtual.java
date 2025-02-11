package br.com.classes.entities;

public class BichinhoVirtual {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.fome = 0;
        this.saude = 100;
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String retornaHumor() {
        if (fome <= 50 && saude >= 50) {
            return "Feliz";
        } else {
            return "Triste";
        }
    }
}
