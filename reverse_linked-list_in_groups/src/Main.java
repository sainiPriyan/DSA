public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head = reverseInGroups(head,3);
        printLinkedList(head);
    }

    public static Node reverseInGroups(Node head, int n){
        Node prevFirst = null, cur = head;
        boolean isFirstDone = true;


        while(cur != null) {

            Node first = cur, prev = null;
            int count = 0;
            while (count<n && cur != null) {
                Node next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next ;
                count++;
            }
            if(isFirstDone) {head = prev; isFirstDone = false;}
            else prevFirst.next = prev;
            prevFirst = first;

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
