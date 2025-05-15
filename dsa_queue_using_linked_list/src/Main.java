public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(3);

        queue.display();


    }
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}
class Queue{
   private Node front, rear;
   private int size;

    public Queue(){
        front = rear = null;
        size = 0;
    }

    public void enqueue(int n){

        Node temp = new Node(n);

        if(front==null){
            front = rear =  temp;
            return;
        }
        rear.next = temp;
        rear = temp;
        size++;
    }

    public void dequeue(){
        if(front == null ) return;
        front = front.next;
        size--;
        if(front == null ) rear = null;
    }

    public void display(){
        Node temp = front;
        for (int i = 0; i <= size; i++) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}