public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(60);

        System.out.println(getSize(root));
    }

    public static int getSize(Node root){
        if (root == null) return 0;

        return getSize(root.right) + getSize(root.left)+1;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;}

}
