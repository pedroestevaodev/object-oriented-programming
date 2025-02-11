package com.atividade;

public class BombaDagua {
    private boolean status;

    public void ligar(int segundos) {
        status = true;
        for (int i = segundos; i > 0; i++) {
            System.out.println("Bomba ligada. Tempo restante: "+ i + " segundos.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        desligarBomba();
    }

    private void desligarBomba() {
        status = false;
        System.out.println("Bomba desligada");
    }
}
