package Tree.BST;

public class BSTLinkedList {
    static Node root;
    public static void insert(int value){
        Node newnode = new Node(value);
        if(root==null){
            root = newnode;
            return;
        }
        else{
            Node current = root;
            Node parent = null;
            while(true){
                parent = current;
                if(value < current.data){
                    current = current.left;
                    if(current==null){
                        parent.left = newnode; //It can also be current = newnode;
                        return;
                    }
                }
                else{
                    current = current.right;
                    if(current==null){
                        parent.right = newnode; //It can also be current = newnode;
                        return;
                    }
                }
            }
        }
    }
    public static boolean search(int value, Node root){
        if(root==null)
            return false;
        if(root.data==value)
            return true;
        if(value<root.data)
            return search(value, root.left);
        return search(value, root.right);
    }
    // Method to search a value in the BST
    public static boolean search(Node root, int val)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == val)
        {
            return true;
        }
        boolean result=false;
        if(root.data>val)
        {
            result = search(root.left, val);
        }
        else
        {
            result = search(root.right,val);
        }
        return result;
    }

    // Method to print the values in inorder traversal
    public static void inorder(Node root)
    {
        if(root== null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    static int sum;

    // Method to replace the node value with sum of greater nodes sum
    public static void replacewithsum(Node root)
    {
        if(root == null)
        {
            return;
        }
        replacewithsum(root.right);
        int temp =root.data;
        root.data= sum;
        sum = sum+temp;
        replacewithsum(root.left);
    }
    public static void main(String[] args) {

    }
}
