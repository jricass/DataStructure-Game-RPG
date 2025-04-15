package br.projeto.rpg.DataStructures.CharacterList;

public class CharacterList {

    private CharacterNode head,tail;

    public void add(Character data){
        CharacterNode newNode = new CharacterNode(data);

        if(head==null){
            this.head=newNode;
            this.tail=newNode;
        }else{
            tail.setNext(newNode);
            newNode.setPrev(this.tail);
            tail=newNode;
        }
    }
    public boolean isEmpty() {
        return this.head == null;
    }

    public void getIndex(){

    }
}
