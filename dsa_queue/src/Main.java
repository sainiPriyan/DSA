public class Main {
   public static void main(String[] args){

       Queue queue = new Queue(5);
       queue.dequeue();
       queue.enqueue(4);
       queue.enqueue(2);
       queue.enqueue(10);
       System.out.println(queue.getFront());
       System.out.println(queue.getRear());
       queue.dequeue();
       System.out.println(queue.getSize());
       queue.enqueue(2);
       queue.enqueue(10);
       queue.enqueue(2);
       queue.enqueue(10);
       queue.enqueue(2);
       queue.enqueue(10);
       System.out.println(queue.isFull());
       System.out.println(queue.isEmpty());
       queue.display();


   }
}
class Queue{
    private int size,front;
    private final int cap;
    private final int[] arr;

    public Queue(int cap){
        this.cap = cap;
        arr = new int[cap];
        size = 0;
        front = 0;
    }
    void enqueue(int n){
        if(isFull()) System.out.println("Queue Overflow");
        else{ int rear = getRear();
            rear = (rear+1)%cap;
            arr[rear] = n;
            size++;
        }
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return;
        }
        front = (front+1)%cap;
        size--;
    }

    public int getFront(){
        if(size == 0 ){
            System.out.println("Queue Underflow");
            return Integer.MIN_VALUE;
        }
        return arr[0];
    }

    public int getRear(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
            return -1;
        }
        return (front+size-1)%cap;
    }

    public boolean isFull(){
        return size>=cap;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public int getSize(){
        return size;
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}