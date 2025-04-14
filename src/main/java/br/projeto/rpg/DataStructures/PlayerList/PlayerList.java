package br.projeto.rpg.DataStructures.PlayerList;

import br.projeto.rpg.Player.Player;

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
        this.size++;
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

    public void enhancedPrint() {
        PlayerNode current = this.head;
        int index = 1;

        if (head == null) {
            System.out.println("Nenhum Jogador Cadastrado");
            return;
        }

        System.out.println("==========Lista de Jogadores Cadastrados ==========");
        while (current != null) {
            System.out.println(index + " - " + current.getData().getName());
            current = current.getNext();
            index++;
        }
    }

    // Getters e Setters
    public PlayerNode getHead() {
        return head;
    }

    public void setHead(PlayerNode head) {
        this.head = head;
    }

    public PlayerNode getTail() {
        return tail;
    }

    public void setTail(PlayerNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
