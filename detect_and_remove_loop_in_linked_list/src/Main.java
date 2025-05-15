public class Main {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next;
        detectAndRemoveLoop(head);
        printLinkedList(head);
    }

    public static void detectAndRemoveLoop(Node head){
        Node slow = head, fast = head;

        if(head == null )return;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) break;

            if(slow.next == head){
                slow.next = null;
                return;
            }

        }
        if(slow != fast){
            System.out.println("No loop!");return;}

        System.out.print("Loop Found");

        slow = head;

        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(" at "+fast.next.value+" !");

        fast.next = null;
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
