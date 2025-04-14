package br.projeto.rpg.Managers.Player;

import br.projeto.rpg.Player.Player;
import br.projeto.rpg.DataStructures.PlayerList.PlayerList;
import br.projeto.rpg.DataStructures.PlayerList.PlayerNode;

public class PlayerManager {

    private final PlayerList playerList;

    public PlayerManager() {
        playerList = new PlayerList();
        Player admin = new Player("admin", "admin");
        playerList.addHead(admin);
    }

    public boolean cadastrarPlayer(String nome, String senha) {
        if (buscarPlayer(nome) != null) {
            return false;
        }
        Player newPlayer = new Player(nome, senha);
        playerList.addHead(newPlayer);
        return true;
    }

    public Player login(String nome, String senha) {
        Player encontrado = buscarPlayer(nome);
        if (encontrado != null && encontrado.getPassword().equals(senha)) {
            return encontrado;
        } else if (encontrado != null && encontrado.getPassword().equals("admin")) {
            return encontrado;
        }
        return null;
    }

    public Player buscarPlayer(String nome) {
        PlayerNode current = playerList.getHead();
        while (current != null) {
            if (current.getData().getName().equals(nome)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public void listarPlayers() {
        playerList.printFromHead();
    }

    public void listarPlayersEnhanced() {
        playerList.enhancedPrint();
    }

    public void deletarPlayer(int index) {
        playerList.delete(index);
    }
}
