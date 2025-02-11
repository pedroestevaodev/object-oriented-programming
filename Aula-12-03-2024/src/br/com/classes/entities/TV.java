package br.com.classes.entities;

public class TV {
    private int canal;
    private int volume;

    public TV(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void alterarCanal(int novoCanal) {
        if (novoCanal >= 0 && novoCanal <= 100) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para "+novoCanal);
        } else {
            System.out.println("Canal inválido");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentado para "+volume);
        } else {
            System.out.println("Volume no máximo");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuido para "+volume);
        } else {
            System.out.println("Volume no mínimo");
        }
    }
}
