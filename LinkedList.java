public class LinkedList {
    Node head,tail;

    public void add(Personagem personagem) {
        Node<Personagem> newNode = new Node<>(personagem);  // Cria um novo nó

        if (head == null) {
           
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;    
        }
    }
}
