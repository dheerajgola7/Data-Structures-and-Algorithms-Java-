package Tree.BST;

public class BinaryTreeNode<T extends Comparable<T>> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    public BinaryTreeNode(T data){
        this.data=data;
        this.left = null; //Optional as default initialized by jvm
        this.right = null; //Optional as default initialized by jvm
    }
}
