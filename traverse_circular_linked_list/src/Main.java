public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(30);
        head.next.next.next = new Node(34);
        head.next.next.next.next = head;

        traverseCircularLinkedList(head);
        head = insertInTheBeginning(head,1);
        traverseCircularLinkedList(head);

    }
    public static Node insertInTheBeginning(Node head, int x){

//        Node cur = head;
//        Node newNode = new Node(x);
//
//        while(cur.next!=head) {
//            cur = cur.next;
//        }
//        cur.next = newNode;
//        newNode.next = head;
//        head = newNode;
//
//        return head;

        Node newNode = new Node(x);
        if(head == null ) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = head.next;
        head.next = newNode;

        int temp = head.value;
        head.value = newNode.value;
        newNode.value = temp;

        return head;
    }
    public static void traverseCircularLinkedList(Node head){
        if(head == null) return;
        if(head.next == head){ System.out.println(head.value);
        return;}

        Node cur = head;

        do{System.out.print(cur.value+" ");
            cur = cur.next;
        }while(cur!=head);

        System.out.println();
    }

}
class Node{
    int value;
    Node next;
    public Node(int value){
        this.value = value;
    }
}