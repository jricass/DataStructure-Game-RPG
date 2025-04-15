package br.projeto.rpg.Player;

import br.projeto.rpg.DataStructures.CharacterList.CharacterList;

public class Player {

    private String name;
    private String password;
    private int balance;


    CharacterList character = new CharacterList();

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

   
}
