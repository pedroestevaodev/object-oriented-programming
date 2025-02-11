import br.com.classes.entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a classe que deseja testar:");
        System.out.println("1. Bola");
        System.out.println("2. Quadrado");
        System.out.println("3. Retângulo");
        System.out.println("4. Pessoa");
        System.out.println("5. Conta Corrente");
        System.out.println("6. TV");
        System.out.println("7. Bichinho Virtual");
        System.out.println("8. Macaco");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                Bola minhaBola = new Bola("Azul", 10.0, "Plástico");
                System.out.println("Cor da bola: " + minhaBola.mostraCor());
                minhaBola.trocaCor("Vermelho");
                System.out.println("Nova cor da bola: " + minhaBola.mostraCor());

                break;
            case 2:
                Quadrado meuQuadrado = new Quadrado(5.0);
                System.out.println("Área do quadrado: " + meuQuadrado.calcularArea());

                break;
            case 3:
                Retangulo meuRetangulo = new Retangulo(4.0, 6.0);
                System.out.println("Área do retângulo: " + meuRetangulo.calcularArea());
                System.out.println("Perímetro do retângulo: " + meuRetangulo.calcularPerimetro());

                break;
            case 4:
                Pessoa pessoa1 = new Pessoa("João", 18, 70.0, 170.0);
                System.out.println("Altura inicial de João: " + pessoa1.getAltura());
                pessoa1.envelhecer();
                System.out.println("Idade de João após um ano: " + pessoa1.getIdade());
                System.out.println("Altura de João após um ano: " + pessoa1.getAltura());

                break;
            case 5:
                ContaCorrente conta = new ContaCorrente(12345, "João", 1000.0);
                conta.deposito(500.0);
                conta.saque(300.0);
                System.out.println("Saldo atual da conta: " + conta.getSaldo());

                break;
            case 6:
                TV minhaTV = new TV(8, 50);
                minhaTV.alterarCanal(50);
                minhaTV.aumentarVolume();
                minhaTV.diminuirVolume();

                break;
            case 7:
                BichinhoVirtual tamagushi = new BichinhoVirtual("Tamagushi");
                tamagushi.setFome(30);
                tamagushi.setSaude(70);
                tamagushi.setIdade(2);
                System.out.println("Humor do Tamagushi: " + tamagushi.retornaHumor());

                break;
            case 8:
                Macaco macaco1 = new Macaco("Macaco 1");
                Macaco macaco2 = new Macaco("Macaco 2");
                macaco1.comer("Banana");
                macaco2.comer("Maçã");
                macaco1.verBucho();
                macaco2.verBucho();
                macaco1.digerir();
                macaco1.verBucho();
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }

        scanner.close();
    }
}