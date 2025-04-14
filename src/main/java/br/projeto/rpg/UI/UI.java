package br.projeto.rpg.UI;

import br.projeto.rpg.Managers.Player.PlayerManager;
import br.projeto.rpg.Player.Player;
import br.projeto.rpg.DataStructures.PlayerList.PlayerList;

import java.util.Scanner;

public class UI {

    Scanner sc = new Scanner(System.in);
    PlayerManager pm = new PlayerManager();

    public void telaInicial() {

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("=======TELA INICIAL=======");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Fazer Login");
            System.out.println("3. Consultar Usuários Cadastrados");
            System.out.println("4. Sair");
            System.out.print("Escolha uma Opção: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = sc.next();
                    System.out.println("Digite uma Senha de sua escolha: ");
                    String senha = sc.next();
                    if (pm.cadastrarPlayer(nome, senha)) {
                        System.out.println("Usuário Criado com sucesso!");
                    } else {
                        System.out.println("O nome de usuário selecionado já foi cadastrado...");
                    }
                    break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    String nomeLogin = sc.next();
                    System.out.println("Digite sua Senha: ");
                    String senhaLogin = sc.next();
                    Player jogador = pm.login(nomeLogin, senhaLogin);
                    if (jogador != null) {
                        System.out.println("Login bem-sucedido!");
                        telaJogo(jogador);
                    }
                    break;
                case 3:
                    System.out.println("Usuários Cadastrados:");
                    pm.listarPlayers();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    public void telaJogo(Player jogador) {
        System.out.println("Bem Vindo Aventureiro " + jogador.getName() + "...");
    }
}
