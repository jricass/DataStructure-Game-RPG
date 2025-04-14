package br.projeto.rpg.DataStructures.PlayerList;

import br.projeto.rpg.Player.Player;

public class PlayerNode {

    private PlayerNode next;
    private Player data;

    public PlayerNode(Player data) {
        this.data = data;
    }

    public PlayerNode(Player data, PlayerNode next) {
        this.data = data;
        this.next = next;
    }

    public Player getData() {
        return data;
    }

    public void setData(Player data) {
        this.data = data;
    }

    public PlayerNode getNext() {
        return next;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }

}
