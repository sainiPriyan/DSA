import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyStack stack = new MyStack(100);
        stack.peek();
        stack.push(1);
        stack.push(100);
        stack.peek();
        stack.push(8);
        stack.peek();
        stack.display();
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        System.out.println();

        MyStackList stack2 = new MyStackList();
        stack2.push(10);
        stack2.push(4);
        stack2.push(3);
        System.out.println(stack2.peek());
        System.out.println(stack2.pop());
        stack2.push(11);
        stack2.display();

        System.out.println();

        MyStackLinkedList stack3 = new MyStackLinkedList();
        System.out.println(stack3.isEmpty());
        stack3.push(3);
        stack3.push(5);
        stack3.push(10);
        System.out.println(stack3.peek());
        System.out.println(stack3.pop());
        stack3.push(100);
        stack3.display();
    }
}
class MyStack{
    private int capacity;
    private int top;
    private int[] stack;

    public MyStack(int capacity){
        this.top = -1;
        this.capacity = capacity;
        stack = new int[capacity];
    }
    public int size(){
        return top+1;
    }
    public void push(int n){
        if(top <= capacity)
            stack[++top] = n;
        else System.out.println("Stack over-flown");
    }
    public void peek() {
        if (top == -1)
            System.out.println("Stack under-flown");
        else System.out.println(stack[top]);
    }

    public int pop(){
        if(top ==-1){ System.out.println("Stack under-flown");
        return -1;
        }
        else{
            stack[top] = 0;
            return stack[top--];
        }
    }
    public void display(){
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return top == -1;
    }


}

class MyStackList{
    ArrayList<Integer> stack = new ArrayList<>();

    public int size(){
        return stack.size();
    }
    public void push(int n){
        stack.add(n);
    }
    public int peek() {
        if(stack.size() == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack.get(stack.size()-1);
    }

    public int pop(){
        if(stack.size() == 0){
            System.out.println("Stack underflow");
            return -1;
        }
        else {
            int pop = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return pop;
        }
    }
    public void display(){
        for (int i : stack) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }

}

class MyStackLinkedList{
    LinkedList <Integer> stack = new LinkedList<>();

    public int size(){
        return stack.size();
    }
    public void push(int n){
        stack.add(0,n);
    }
    public int peek() {
        if(stack.size() == 0){
            System.out.println("Stack underflow");
            return Integer.MAX_VALUE;
        }
        return stack.get(0);
    }

    public int pop(){
        if(stack.size() == 0){
            System.out.println("Stack underflow");
            return Integer.MIN_VALUE;
        }
        else {
            int pop = stack.get(0);
            stack.remove(0);
            return pop;
        }
    }
    public void display(){
        for (int i = stack.size()-1;i>=0;i--) {
            System.out.print(stack.get(i)+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return stack.size() == 0;
    }
}