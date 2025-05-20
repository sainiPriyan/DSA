public class Main {

        public static void main(String[] args) {
            Node root = new Node(10);
            root.left = new Node(20);
            root.right = new Node(70);
            root.left.left = new Node(40);
            root.left.right = new Node(50);
            root.right.right = new Node(60);

            System.out.println(getMax(root));
        }

        public static int getMax(Node root){
            if (root == null) return Integer.MIN_VALUE;

            return Math.max(getMax(root.right),root.data);
        }
    }

    class Node {
        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;}

    }
