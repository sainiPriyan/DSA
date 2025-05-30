public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.left.left = new Node(40);
        root.left.left.right = new Node(40);
        root.left.right = new Node(50);
        root.left.right.left = new Node(50);
        root.left.right.right = new Node(50);
        root.right.left = new Node(60);
        root.right.left.left = new Node(60);
        root.right.left.right = new Node(60);
        root.right.right = new Node(60);

        System.out.println(countNodes(root));

    }
    static int count = 0;
    public static int countNodes(Node root){

        isFull(root);
        return count;

    }

    public static void isFull(Node root){

         if(root == null) return;

         int rightHeight = 0, leftHeight = 0;
         Node rightRoot = root, leftRoot = root;

        while(rightRoot != null){
            rightRoot=rightRoot.right;
            rightHeight++;
        }
        while(leftRoot != null){
            leftRoot=leftRoot.left;
            leftHeight++;
        }

        if(leftHeight == rightHeight){
            count+= Math.pow(2,leftHeight) - 1;
        }
        else{
            count++;
            isFull(root.left);
            isFull(root.right);
        }



    }

}
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;}

}