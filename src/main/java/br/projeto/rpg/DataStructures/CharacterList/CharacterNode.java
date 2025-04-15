package br.projeto.rpg.DataStructures.CharacterList;

public class CharacterNode {
    private CharacterNode prev,next;
    private Character data;

    public CharacterNode(Character data){
          this.next=null;
          this.prev=null;
          this.data=data;
    }
    public CharacterNode getPrev() {
        return prev;
    }
    public void setPrev(CharacterNode prev) {
        this.prev = prev;
    }
    public CharacterNode getNext() {
        return next;
    }
    public void setNext(CharacterNode next) {
        this.next = next;
    }
    public Character getData() {
        return data;
    }
    public void setData(Character data) {
        this.data = data;
    }
}
