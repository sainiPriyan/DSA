public class Main {

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(15);
        head.next.next.next.next.next = new Node(16);
        head.next.next.next.next.next.next = new Node(20);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(5);
        head2.next.next.next = new Node(10);
        head2.next.next.next.next = new Node(12);
        head2.next.next.next.next.next = new Node(17);
        head2.next.next.next.next.next.next = new Node(27);

        head = mergeTwoSortedLinkedList(head,head2);
        printLinkedList(head);

    }

    public static Node mergeTwoSortedLinkedList(Node head1, Node head2){

        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node a = head1, b = head2;
        Node head , tail;

        if (head1.value < head2.value){
            head = tail = head1;
            a=a.next;
        }
        else{
            head = tail = head2;
            b = b.next;
        }

        while(a!=null && b!=null){
            if(a.value < b.value){
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if(a==null)
            tail.next = b;
        else
            tail.next = a;

        return head;
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