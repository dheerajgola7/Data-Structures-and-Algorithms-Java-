package Stack;

import Linked_List.Nodes.SNode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StackByLinkedList {
    SNode top;
    public StackByLinkedList()
    {
        top = null;
    }

    public boolean isEmpty()
    {
        return top == null;
    }

    // Overloading Concept: same method with different arguments
    public void push(SNode newnode){
        //if stack is empty then top = null and newnode.next is set to null therefore it will be fine.
        newnode.next = top;
        top = newnode;
    }
    public void push()
    {
        Scanner sc = new Scanner(System.in);
        try {
            push(sc.nextInt()); //if user entered any non integer value
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
    }
    public void push(int data) {
        SNode newnode = new SNode(data);
        push(newnode);
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("empty");
            return 0;
        }
        else
        {
            int ans = top.data;
            top = top.next;
            return ans;
        }
    }
}



/*
1)get choice from user implement stack by
he wants to work with array , singly linked list or doubly linkled lis
2) which operation you want to perform
3) use the concept of data hiding by making the variables private
4) use getter and setter methods along with constructors
5) use overloading feature
6) use user defined exception as per your understanding of the type of exception
7) use predefined exceptions also
 */
