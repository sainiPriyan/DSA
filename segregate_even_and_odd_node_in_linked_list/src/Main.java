public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(8);
        head = segregateOddAndEven(head);
        printLinkedList(head);
    }

    public static Node segregateOddAndEven(Node head){
        Node evenStart = null, evenEnd = null, oddStart =null, oddEnd = null, cur = head;

        while(cur!= null){
            if (cur.value%2 == 0){
                if(evenStart == null){
                    evenStart = evenEnd = cur;
                }
                else{ evenEnd.next = cur;
                      evenEnd  = cur;  }
            }
            else{
                if(oddStart == null){
                    oddStart = oddEnd = cur;
                }
                else {
                    oddEnd.next = cur;
                    oddEnd = oddEnd.next;
                }
            }
            cur = cur.next;
        }

        if(oddEnd==null || evenEnd == null)
            return head;

        evenEnd.next = oddStart;
        oddEnd.next = null;

        return evenStart;
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