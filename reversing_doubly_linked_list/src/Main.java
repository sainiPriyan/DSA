public class Main {
    public static void main(String[] args){

    }
    public static Node reverseLinkedList(Node head){
        if(head == null || head.next == null) return head;
        Node pvs = null,cur =head;

        while (cur!=null){
            pvs = cur.prev;
            cur.prev = cur.next;
            cur.next = pvs;
            cur = cur.prev;
        }
            return pvs.prev;
    }
}

class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value = value;
    }
}
