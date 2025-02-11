package com.personagem;

import com.utils.Mensagens;
import com.utils.Utils;
import java.util.Scanner;
import static java.lang.System.*;

public class CriarPersonagem implements CriacaoPersonagem {
    private final Scanner scanner;

    public CriarPersonagem(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Personagem criarJogador() {
        Utils ut = new Utils(scanner);
        Mensagens msg = new Mensagens();

        out.println("\n***********************************************");
        out.println("*                JORNADA ÉPICA                *");
        out.println("***********************************************");

        out.println("\nBem-vindo(a) ao Conquistadores do Reino!\n");
        String nomePlayer = ut.validarInfo("Por favor, digite seu nome:", "O nome não pode conter números, caracteres especiais ou espaço. Por favor, tente novamente.", valor -> valor.matches("[a-zA-Z]+"));
        out.println();
        String generoPlayer = ut.validarInfo("Olá, " + nomePlayer + "! Você deseja ser um rei ou uma rainha? (Digite 'rei' ou 'rainha'):", "Por favor, digite 'rei' ou 'rainha'.", valor -> valor.equalsIgnoreCase("rei") || valor.equalsIgnoreCase("rainha")).toLowerCase();
        out.println();
        String racaPlayer = ut.gerarPergunta("Ótimo, " + generoPlayer + " " + nomePlayer + "! Agora, qual será a raça do seu personagem?");
        out.println();
        String classePlayer = ut.gerarPergunta("Perfeito! E qual será sua classe?");
        out.println();
        String caracteristicasPlayer = ut.gerarPergunta("Poderia contar mais sobre as características de seu personagem?");

        out.println("\nConfira os dados:");
        out.println("Nome: " + nomePlayer);
        out.println("Gênero: " + generoPlayer);
        out.println("Raça: " + racaPlayer);
        out.println("Classe: " + classePlayer);
        out.println("Características: " + caracteristicasPlayer);
        String confirmacao = ut.gerarPergunta("Os dados estão corretos? (Digite 'sim' ou 'nao'):");

        while (!confirmacao.equalsIgnoreCase("sim")) {
            String opcaoEdicao = ut.gerarPergunta("\nQual dado você gostaria de editar? (nome, gênero, raça, classe ou características)").toLowerCase();

            switch (opcaoEdicao) {
                case "nome":
                    nomePlayer = ut.gerarPergunta("Por favor, digite seu nome:");
                    break;
                case "gênero":
                    generoPlayer = ut.gerarPergunta("Você deseja ser um rei ou uma rainha? (Digite 'rei' ou 'rainha'):").toLowerCase();
                    break;
                case "raça":
                    racaPlayer = ut.gerarPergunta("Qual será sua raça?");
                    break;
                case "classe":
                    classePlayer = ut.gerarPergunta("Qual será sua classe?");
                    break;
                case "características":
                    caracteristicasPlayer = ut.gerarPergunta("Quais as características de seu personagem?");
                    break;
                default:
                    out.println("Opção inválida!");
            }

            out.println("\nResumo dos dados atualizados:");
            out.println("Nome: " + nomePlayer);
            out.println("Gênero: " + generoPlayer);
            out.println("Raça: " + racaPlayer);
            out.println("Classe: " + classePlayer);
            out.println("Características: " + caracteristicasPlayer);

            out.println("\nOs dados estão corretos? (Digite 'sim' para confirmar ou 'editar' para fazer alterações):");
            confirmacao = scanner.nextLine().toLowerCase();
        }

        return new Personagem(nomePlayer, generoPlayer, racaPlayer, classePlayer, caracteristicasPlayer);
    }
}
