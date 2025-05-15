public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);


        head = pairwiseSwapNodes(head);
        printLinkedList(head);

    }

    public static Node pairwiseSwapNodes(Node head){
        if (head == null || head.next == null) return  head;

        Node prev = head, cur = head, next = head.next;

        cur.next = next.next;
        next.next = cur;
        head = next;

        cur = cur.next;
        if(cur == null) return head;
        next = cur.next;

        while(cur.next != null ){
            cur.next = next.next;
            next.next = cur;
            prev.next = next ;

            prev = cur;
            cur = cur.next;
            if(cur == null) return head;
            next = cur.next;
        }
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
