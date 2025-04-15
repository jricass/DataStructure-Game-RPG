package br.projeto.rpg.Characters;

import java.util.Random;

public class Character {
    private int id,level;
    private int lifeMax,lifeCurr;
    private int manaMax,manaCurr;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getLifeMax() {
        return lifeMax;
    }
    public void setLifeMax(int lifeMax) {
        this.lifeMax = lifeMax;
    }
    public int getLifeCurr() {
        return lifeCurr;
    }
    public void setLifeCurr(int lifeCurr) {
        this.lifeCurr = lifeCurr;
    }
    public int getManaMax() {
        return manaMax;
    }
    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }
    public int getManaCurr() {
        return manaCurr;
    }
    public void setManaCurr(int manaCurr) {
        this.manaCurr = manaCurr;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Character(int level, String name) {
        this.level = level;
        this.name = name;
    }

     public int atttacked(int damage){
        lifeCurr-=damage;

        if(lifeCurr<0){
            lifeCurr=0;
        }
        return lifeCurr;
    }
    
    public int curar(int cura){
        lifeCurr+=cura;

        if(lifeCurr>lifeMax){
            lifeCurr=lifeMax;
        }
        return lifeCurr;
    }


        public int setManaMaxima(){
            Random random = new Random();
            manaMax = random.nextInt(11) + level*10; 
            manaCurr = manaMax; 
            return manaMax;
        }
       
    
    
    public int setVidaMaxima(){
        Random random = new Random();
        lifeMax = random.nextInt(11) + level*10; 
        lifeCurr = lifeMax; 
        return lifeMax;
    }

    public void usarHabilidade(){
        
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + this.name + '\'' +
                ", level=" + level +
                ", vida=" + lifeCurr + "/" + lifeMax +
                ", mana=" + manaCurr + "/" + manaMax +
                '}';
}

}
