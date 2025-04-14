package br.projeto.RPG.Player.PlayerList;

import br.projeto.RPG.Player.Player;

public class PlayerList {

    private PlayerNode head;
    private PlayerNode tail;
    private int size;

    public PlayerList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addHead(Player data) {
        PlayerNode newNode = new PlayerNode(data);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else if (this.size == 1) {
            newNode.setNext(this.head);
            this.head = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    public void addTail(Player data) {
        PlayerNode newNode = new PlayerNode(data);
        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
        } else if (this.size == 1) {
            newNode.setNext(this.tail);
            this.tail = newNode;
        } else {
            newNode.setNext(this.tail);
            this.tail = newNode;
        }
    }

    public void printFromHead() {
        PlayerNode current = this.head;
        System.out.print("Head --> [");
        while (current.getNext() != null) {
            System.out.print(current.getData().getName() + ", ");
            current = current.getNext();
        }
        System.out.println(current.getData().getName() + "] <-- Tail");
    }

}
