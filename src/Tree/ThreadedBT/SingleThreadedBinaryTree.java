package Tree.ThreadedBT;

public class SingleThreadedBinaryTree{
    public static void main(String[] args) {
        Node n1 = new Node(30);
        Node n2 = new Node(40);
        Node n3 = new Node(50);
        Node n4 = new Node(60);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.left = n1;
        dummy.right = dummy;
        dummy.rightThread = true;
    }
}