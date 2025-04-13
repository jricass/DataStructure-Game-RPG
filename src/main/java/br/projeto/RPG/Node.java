public class Node<T> {
    Personagem data;  
    Node<T> next, prev;  

   
    public Node(Personagem data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
