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

    public Player removeHead() {
        if (isEmpty()) {
            System.out.println("Lista vazia");;
        } else if (size == 1) {
            return this.removeHead();
        }
        Player removed = this.head.getData();
        this.head = this.head.getNext();
        this.size--;

        return removed;
    }

    public Player removeTail() {
        if (isEmpty()) {
            System.out.println("Lista vazia");;
        } else if (size == 1) {
            return this.removeHead();
        }
        PlayerNode prevLast = this.getLlNode(this.size - 2);
        Player removed = prevLast.getNext().getData();
        prevLast.setNext(null);
        this.tail = prevLast;
        this.size--;

        return removed;
    }

    public Player delete(int position) {
        if (isEmpty()) {
            System.out.println("Lista vazia");
        } else if (position < 0 || position > this.size) {
            System.out.println("Posição Inválida");
        } else if (position == this.size) {
            System.out.println("Posição Inválida");
        } else if (position == 0) {
            return this.removeHead();
        } else if (position == this.size - 1) {
            return this.removeTail();
        } else {
            PlayerNode prevPlayerNode = this.getLlNode(position - 1);
            PlayerNode current = prevPlayerNode.getNext();
            PlayerNode nextPlayerNode = current.getNext();

            prevPlayerNode.setNext(nextPlayerNode);
            current.setNext(null);
            this.size--;

            return current.getData();
        }
        return null;
    }

    private PlayerNode getLlNode(int pos) {
        if (pos < 0 && pos > this.size) {
            System.out.println("Posição Inválida");
        }
        PlayerNode current = this.head;
        for (int i = 0; i < pos; i++) {
            current = current.getNext();
        }
        return current;
    }

    public Player getByIndex(int pos) {
        return this.getLlNode(pos).getData();
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
            System.out.println("Nenhum Jogador Cadastrado...");
            return;
        }

        System.out.println("==========Lista de Jogadores Cadastrados==========");
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
