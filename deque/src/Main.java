import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque(5);
        deque.insertFront(4);
        deque.insertFront(5);
        deque.insertRear(1);
        deque.insertRear(2);
        deque.insertRear(3);
        deque.insertRear(3);

        deque.printDequeArray();

        deque.removeFront();
        deque.removeFront();
        deque.removeRear();


        deque.printDequeArray();

    }
}

class Deque{
    int size,front,rear;
    int capacity;
    int [] arr;
    Deque(int capacity){
        this.capacity = capacity;
        size = 0;
        front = rear = 0;
        arr = new int[capacity];
    }

    public void insertFront(int x){
        if(size<capacity){
            arr[front] = x;
            front = (front+1)%capacity;
            size++;
        }
        else System.out.println("No space to insert");
    }

    public void removeFront(){
        if(size>0){
            front = (capacity+front-1)%capacity;
            size--;}
        else
            System.out.println("Deque Underflow");
    }

    public void removeRear(){
        if(size>0){
            rear = (rear+1)%capacity;
            size--;}
        else
            System.out.println("Deque Underflow");
    }

    public void insertRear(int x){
        if(size<capacity){
            rear = (capacity+rear-1)%capacity;
            arr[rear] = x;
            size++;
        }
        else System.out.println("No space to insert");
    }

    public void printDequeArray(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[rear]+" ");
            rear=(rear+1)%capacity;
        }
        System.out.println();

        System.out.print("Array Structure: ");
        System.out.println(Arrays.toString(arr));
    }

}