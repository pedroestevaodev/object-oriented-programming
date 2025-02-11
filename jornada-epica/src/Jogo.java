import com.equipamento.Capacete;
import com.equipamento.Equipamento;
import com.equipamento.Espada;
import com.equipamento.Roupas;
import com.personagem.CriarPersonagem;
import com.personagem.Personagem;
import com.utils.Mensagens;
import com.utils.Utils;

import java.util.Scanner;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Utils ut = new Utils(scanner);
        Mensagens msg = new Mensagens();

        CriarPersonagem criar = new CriarPersonagem(scanner);
        Personagem personagem = criar.criarJogador();

        String perguntaIniciar = ut.validarInfo("Está pronto para iniciar a jornada? (sim ou nao)", "Por favor, digite 'sim' ou 'nao'.", valor -> valor.equalsIgnoreCase("sim") || valor.equalsIgnoreCase("nao"));
        if (perguntaIniciar.equalsIgnoreCase("nao")) {
            out.println("\nEncerrando o jogo...");
            exit(0);
        }

        ut.limparPrompt();
        ut.exibirTextoPausado(msg.parametrosMensagem(msg.exibirMensagem("mensagem.start."+personagem.getGenero()), personagem.getNome(), personagem.getGenero(), "Avalon").replace("[BREAK]", "\n"));
        out.println("\n\n");

        Equipamento espada = new Espada();
        Equipamento capacete = new Capacete();
        Equipamento roupas = new Roupas();

        personagem.getEquipamento().add(espada);
        personagem.getEquipamento().add(capacete);
        personagem.getEquipamento().add(roupas);

        out.println("\nSeus equipamentos são:");
        for (Equipamento equipamento : personagem.getEquipamento()) {
            out.println(equipamento.toString());
        }
    }
}