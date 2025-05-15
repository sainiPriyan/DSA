public class Main {
    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = new Node(7);

        head  = swapKthNode(head,4);
        printLinkedList(head);
    }
    public static Node swapKthNode(Node head, int k) {

        if(head == null) return null;

        Node cur = head, x=null,y=null;
        int n = 1;

        while(cur.next != null ){
            if(n==k) x = cur;
            cur = cur.next;
            n++;
        }

        if(k>n) return head;

        cur = head;

        for(int j = 1; j < n-k+1 ; j++){
            cur = cur.next;
        }
        y = cur;


        int temp = x.data;
        x.data = y.data;
        y.data = temp;

        return head;
    }


    public static void printLinkedList(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
