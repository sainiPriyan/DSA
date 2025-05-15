public class Main {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(7);

        head = SortedInsertLinkedList(head,2);

        printLinkedList(head);
    }

    public static Node SortedInsertLinkedList(Node head, int x){

        Node newNode = new Node(x);
        Node cur = head;

        if(x < head.value){
            newNode.next = head;
            return newNode;
        }

        while (cur.next != null && x > cur.next.value)
            cur = cur.next;

        newNode.next = cur.next;
        cur.next = newNode;

        return head;
    }

    public static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
class Node{
    int value;
    Node next;

    public Node(int value){
        this.value = value;
        this.next = null;
    }
}