package br.projeto.RPG.UI;

import br.projeto.RPG.Player.Player;
import br.projeto.RPG.Player.PlayerList.PlayerList;

import java.util.Scanner;

public class UI {

    Scanner sc = new Scanner(System.in);


    public void interface1() {

        PlayerList listPlayers = new PlayerList();
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
                    System.out.println("Usuário Criado com sucesso!");
                    Player player = new Player(nome, senha);
                    listPlayers.addHead(player);
                    listPlayers.printFromHead();
                    break;
                case 2:
                    System.out.println("Digite seu nome: ");
                    String nomeLogin = sc.next();
                    System.out.println("Digite sua Senha: ");
                    String senhaLogin = sc.next();
                    interface2();
                    break;
                case 3:
                    System.out.println("Usuários Cadastrados:");
                    listPlayers.printFromHead();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
    }

    public void interface2() {
        int escolha = 0;

        while (escolha != 5) {
            System.out.println("==========RPG FOFO==========");
            System.out.println("1. Iniciar Novo Jogo");
            System.out.println("2. Consultar Jogos Salvos");
            System.out.println("4. PVP");
            System.out.println("5. Sair");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Não Implementado");
                    break;
                case 2:
                    System.out.println("Não Implementado");
                    break;
                case 3:
                    System.out.println("Não Implementado");
                    break;
                case 4:
                    System.out.println("Não Implementado");
                    break;
                case 5:
                    System.out.println("Não Implementado");
                    break;
                default:
                    System.out.print("Opção Inválida!");
            }
        }

    }

}
