

public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        head = cloneLinkedList(head);
        printLinkedList(head);

    }

    public static Node cloneLinkedList(Node head){
//        if(head == null || head.next == null) return head;
        Node cur = head;

        while(cur!= null){
            Node next = cur.next;
            cur.next = new Node(cur.value);
            cur.next.next = next;
            cur = next;
        }

        for ( cur = head; cur!=null; cur=cur.next.next) {
            cur.next.random = (cur.random==null)?null:cur.random.next;
        }

        Node newHead = head.next;
        Node clone  = newHead;

        for ( cur = head; cur!=null;cur=cur.next){
            cur.next = cur.next.next;
            clone.next = (clone.next!= null)?clone.next.next:null;
            clone = clone.next;
        }
        return  newHead;
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
    Node next,random;

    public Node(int value){
        this.value = value;
        this.next = null;
        this.random = null;
    }
}