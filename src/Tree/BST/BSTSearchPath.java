package Tree.BST;
import Linked_List.SinglyLL.SinglyLL;

import java.util.Scanner;

public class BSTSearchPath {
    public static void insert(Node root, Node newnode){
        if(root==null){
            root = newnode;
            return;
        }
        else{
            Node current = root;
            Node parent = null;
            while(true){
                parent = current;
                if(newnode.data < current.data){
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

    public static SinglyLL Path(Node root, int val){
        if(root == null)
            return new SinglyLL();
        else if(root.data == val){
            SinglyLL obj = new SinglyLL();
            obj.insertAtLast(root.data);
            return obj;
        }
        else if(val<root.data){
            SinglyLL left = Path(root.left,val);
            if(left.size!=0){
                left.insertAtLast(root.data);
                return left;
            }
        }
        else{
            SinglyLL right = Path(root.right,val);
            if(right.size!=0){
                right.insertAtStart(root.data);
                return right;
            }
        }
        return new SinglyLL();
    }

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

    public static void main(String[] args) {
        Node n1 = new Node(30);
        Node n2 = new Node(20);
        Node n3 = new Node(10);
        Node n4 = new Node(40);
        Node n5 = new Node(25);
        Node n6 = new Node(35);
        Node n7 = new Node(45);
        insert(null,n1);
        insert(n1,n2);
        insert(n1,n3);
        insert(n1,n4);
        insert(n1,n5);
        insert(n1,n6);
        insert(n1,n7);
        inorder(n1);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value to search its path: ");
        int x = sc.nextInt();
        SinglyLL res = Path(n1,x);
        if(res.size==0)
            System.out.println("Not available in tree");
        else{
            System.out.println("Path to reach "+x+":");
            res.display();
        }
    }
}
