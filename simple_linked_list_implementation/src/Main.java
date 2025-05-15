public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        printLinkedList(head);
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