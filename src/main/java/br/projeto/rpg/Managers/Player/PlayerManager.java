package br.projeto.rpg.Managers.Player;

import br.projeto.rpg.Player.Player;
import br.projeto.rpg.DataStructures.PlayerList.PlayerList;
import br.projeto.rpg.DataStructures.PlayerList.PlayerNode;

public class PlayerManager {

    private PlayerList playerList;

    public PlayerManager() {
        playerList = new PlayerList();
    }

    public boolean cadastrarPlayer(String nome, String senha) { return false; }

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
}
