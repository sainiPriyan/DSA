public class Main {
    public static void main(String[] args) {

        Node head = new Node(10);
        Node first = new Node(20);
        Node second= new Node(30);

        head.next = first;
        first.prev = head;
        first.next  = second;
        second.prev = first;

    }
}

class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
        next = null;
        prev = null;
    }
}
