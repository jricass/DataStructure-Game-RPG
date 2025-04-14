package br.projeto.rpg.Player;

public class Player {

    private String name;
    private String password;
    private int balance;
    private Character character;

    public Player(String name, String password) {
        this.name = name;
        this.password = password;
        this.balance = 0;
        this.character = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
