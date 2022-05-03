package Tree.BST;

class BST<T extends Comparable<T>>{
    public void insert(BinaryTreeNode<T> root, T value){
        if(value.compareTo(root.data)<0){
            if(root.left!=null){
                insert(root.left,value);
            }
            else{
                System.out.println("Inserted "+value+" to the left of "+root.data);
                root.left = new BinaryTreeNode<>(value);
            }
        }
        else if(value.compareTo(root.data)>0){
            if(root.right!=null){
                insert(root.right,value);
            }
            else{
                System.out.println("Inserted "+value+" to the right of "+root.data);
                root.right = new BinaryTreeNode<>(value);
            }
        }
    }

    public void traverseInOrder(BinaryTreeNode<T> node){
        if(node!=null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(BinaryTreeNode<T> node){
        if(node!=null){
            System.out.print(" "+node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(BinaryTreeNode<T> node){
        if(node!=null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    public int height(BinaryTreeNode<T> node){
        if(node==null)
            return -1;
        int lheight= height(node.left);
        int rheight= height(node.right);
        if(lheight<rheight)
            return rheight+1;
        else
            return lheight+1;
    }

    void printInRange(BinaryTreeNode<Integer> node, int lb, int ub) {
        if (node == null) {
            return;
        }
//        if (lb < node.data) {
//            printInRange(node.left, lb, ub);
//        }
//        if (lb <= node.data && ub >= node.data) {
//            System.out.print(node.data + " ");
//        }
//        printInRange(node.right, lb, ub);
        if(node.data<ub)
            printInRange(node.right,lb,ub);
        if(node.data<ub && node.data>lb)
            System.out.print(node.data+" ");
        if(node.data>lb)
            printInRange(node.left,lb,ub);

    }

    public boolean checkBST(BinaryTreeNode<Integer> node){
        if(node==null)
            return true;
        return checkBST(node.left)&checkBST(node.right);
    }

    public BinaryTreeNode<Integer> Delete(BinaryTreeNode<Integer> root, int val) {
        if (root == null)
            return null;
        else if (val < root.data)
            root.left = Delete(root.left, val);
        else if (val > root.data)
            root.right = Delete(root.right, val);
        else {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            //To replace with inorder successor
            else {
                int minimum = min(root.right);
                root.data = minimum;
                root.right = Delete(root.right, minimum);
            }
            /*To replace with inorder predecessor
            else {
                int maximum = max(root.left);
                root.data = maximum;
                root.left = Delete(root.left, maximum);
            }   */
            return root;
        }
        return root;
    }

    //To find inorder successor
    public int min(BinaryTreeNode<Integer> root){
        if(root.left==null)
            return root.data;
        else
            return min(root.left);
    }

    //To find inorder predecessor
    public int max(BinaryTreeNode<Integer> root){
        if(root.right==null)
            return root.data;
        else
            return max(root.right);
    }
}
public class BSTRecursion {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value "+root.data);
        int[] arr = {2,4,8,6,7,3,9};
        for (int i: arr) {
            tree.insert(root,i);
        }
        System.out.println("Traversing tree inorder(LDR)");
        tree.traverseInOrder(root);
        System.out.println("\nTraversing tree preorder(DLR)");
        tree.traversePreOrder(root);
        System.out.println("\nTraversing tree postorder(LRD)");
        tree.traversePostOrder(root);
        System.out.println("\nHeight of tree = "+tree.height(root));
        tree.printInRange(root,5,10);
        tree.Delete(root,5);
        System.out.println("Traversing tree inorder(LDR)");
        tree.traverseInOrder(root);

    }
}
