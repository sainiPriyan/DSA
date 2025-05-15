public class Main {
    public static void main(String[] args) {

        long a = 851670924409L, b = 747810590830L, sum = 0;

//        while (num1 != null) {
//            a = (long) (a * 10 + num1.data);
//            num1 = num1.next;
//        }
//
//        while (num2 != null) {
//            b = (long) (b * 10 + num2.data);
//            num2 = num2.next;
//        }

        sum = (long) a + b;

        if (sum == 0) System.out.println("NULL");

        Node ans = new Node((int) sum % 10);
        sum = (long) sum / 10;

        while (sum > 0) {
            Node temp = new Node((int) sum % 10);
            sum = (long) sum / 10;
            temp.next = ans;
            ans = temp;

        }

        System.out.println();

    }
}
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}