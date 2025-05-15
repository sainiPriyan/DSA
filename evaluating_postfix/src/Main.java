import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(evaluate(new String[]{"100", "200", "+", "2", "/", "5", "*", "7", "+"}));
    }

        public static int evaluate(String[] arr) {
            Stack<Integer> stack = new Stack<>();
            int x = 0, y =0;

            for (String s : arr) {

                if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                   int n = Integer.parseInt(s);
                    System.out.println(n);
                    stack.push(n);
                }

                else {
                        y = stack.pop();
                        x = stack.pop();

                    System.out.println("After popping "+Arrays.toString(stack.toArray()));


                    switch (s) {
                        case "+" -> stack.push(x + y);
                        case "-" -> stack.push(x - y);
                        case "*" -> stack.push(x * y);
                        case "/" -> stack.push(x / y);
                    }
                    System.out.println(s+" = "+Arrays.toString(stack.toArray()));
                }
            }
            System.out.println(Arrays.toString(stack.toArray()));
            return stack.pop();

    }
}
