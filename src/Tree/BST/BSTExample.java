package Tree.BST;

import java.util.ArrayList;
import java.util.Iterator;

public class BSTExample {


// deletion in Binary search tree

    public Node deleteNode(Node root, int val)
    {
        if (root == null)
        {
            return null;
        }
        if(val<root.data) {
            root.left=  deleteNode(root.left, val);
        }
        else if(val>root.data)
        {
            root.right= deleteNode(root.right,val);
        }
        else
        {
            if(root.left == null && root.right == null)
            {
                return null;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            else if(root.left == null)
            {
                return root.right;
            }
            else
            {
                int minimum = Minval(root.right);
                root.data = minimum;
                root.right= deleteNode(root.right,minimum);
            }
        }
        return root;
    }

    // Method to find the min val in BST
    public static int Minval(Node root)
    {
        if(root.left == null)
        {
            return root.data;
        }
        return Minval(root.left);
    }
    // Method to insert a new node in BST.
    public static void insert(Node root, Node newnode)
    {
        if(root== null)
        {
            root = newnode;
            return;
        }
        else if(newnode.data<root.data)
        {
            if(root.left== null)
            {
                root.left= newnode;
            }
            else
            {
                insert(root.left,newnode);
            }
        }
        else if(newnode.data>root.data)
        {
            if(root.right == null)
            {
                root.right = newnode;
            }
            else
            {
                insert(root.right,newnode);
            }
        }
    }

    // Method to print the path from the root to the search value
    public static ArrayList path(Node root, int val)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data == val)
        {
            ArrayList output = new ArrayList();
            output.add(root.data);
            return output;
        }
        else if(val<root.data)
        {
            ArrayList left= path(root.left,val);
            if(left != null) {
                left.add(root.data);
            }
            return left;
        }
        else
        {
            ArrayList right = path(root.right, val);
            if(right != null){
                right.add(root.data);
            }
            return right;
        }
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
        Node n1 = new Node(30);
        Node n2 = new Node(20);
        Node n3 = new Node(25);
        Node n4 = new Node(35);
        Node n5 = new Node(40);
        insert(null,n1);
        insert(n1,n2);
        insert(n1,n3);
        insert(n1,n4);
        insert(n1,n5);
        System.out.println("inorder Traversal");
        inorder(n1);

        System.out.println("path finding ");
        ArrayList res = path(n1,40);
        int result = Minval(n1);
        System.out.println("min val in the tree is = "+ result);
        Iterator i = res.iterator();
        while(i.hasNext())
            System.out.println(i.next());
        replacewithsum(n1);
        System.out.println("After modification with highest value sum inorder Traversal");
        inorder(n1);
    }

}
