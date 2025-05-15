import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue);
    }
}
