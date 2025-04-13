public class LinkedList {
    Node head,tail;
    Personagem personagem = new Personagem();

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

    public int size() {
        int contador = 0;
        Node curr=head;

        while (curr != null) {
            curr = curr.next;
            contador++;
        }


        return contador;
    }

    public String selecionar_index(int i) {
        int index = 0;
        Node temp = head;

        while (temp != null && index < i) {
            temp = temp.next;
            index++;
        }

        if (temp != null) {
            return temp.data.nome;
        } else {
            return null; // índice inválido
        }
    }

}
