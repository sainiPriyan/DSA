public class Main {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        printLinkedList(head);

        nthNodeFromTheEnd(head,1);
        nthNodeFromTheEnd(head,10);
        nthNodeFromTheEnd(head,4);
    }

    public static void nthNodeFromTheEnd(Node head, int n){
        Node pointer1 = head,pointer2 = head;

        for(int i = 0; i<n-1;i++){
            if (pointer1 != null)
                pointer1 = pointer1.next;
            else {
                System.out.println("Nuh uh");
                return;
            }
        }

        while(pointer1.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        System.out.println(pointer2.value);

    }
    public static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
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
