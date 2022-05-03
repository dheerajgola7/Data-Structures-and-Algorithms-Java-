package Tree.BST;

import java.util.Stack;
class BSTIterable<T extends Comparable<T>>{
    BinaryTreeNode<T> root;
    public void insert(T value) {
        BinaryTreeNode<T> newnode = new BinaryTreeNode<>(value);
        if(root==null){
            root = newnode;
            return;
        }
        else{
            BinaryTreeNode<T> current = root;
            BinaryTreeNode<T> parent = null;
            while(true){
                parent = current;
                if(value.compareTo(current.data)<0){
                    current = current.left;
                    if(current==null){
                        parent.left = newnode; //It can also be current=newnode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current==null){
                        parent.right = newnode; //It can also be current=newnode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverse() {
        if (root == null)
            return;
        Stack<BinaryTreeNode<T>> s = new Stack<BinaryTreeNode<T>>();
        BinaryTreeNode<T> curr = root;
        while (curr != null || s.size() > 0) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    public void preOrderTraverse() {
        if (root == null)
            return;
        Stack<BinaryTreeNode<T>> s = new Stack<BinaryTreeNode<T>>();
        BinaryTreeNode<T> curr = root;
        s.push(curr);
        while (!s.empty()) {
            curr=s.peek();
            System.out.print(curr.data + " ");
            s.pop();
            if (curr.right != null) {
                s.push(curr.right);
            }
            if (curr.left != null){
                s.push(curr.left);
            }
        }
    }
}
public class BSTIteration {
    public static void main(String[] args) {
        BSTIterable<Integer> tree = new BSTIterable<>();
        System.out.println("Binary Tree Example");
        int[] arr = {5,2,4,8,6,7,3,9};
        for (int i: arr) {
            tree.insert(i);
        }
        System.out.println("Traversing tree inorder(LDR)");
        tree.inOrderTraverse();
        System.out.println("\nTraversing tree preorder(DLR)");
        tree.preOrderTraverse();
    }
}
