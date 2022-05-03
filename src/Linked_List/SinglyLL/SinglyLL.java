package Linked_List.SinglyLL;

import Linked_List.Nodes.SNode;

public class SinglyLL {
    public SNode head;
    public int size = 0;

    public void insertAtStart(int data){
        SNode newnode = new SNode(data);
        if(head!=null) newnode.next = head;
        head = newnode;
        size++;
        System.out.println("Inserted Successfully at Start");
    }

    public void insertAtLast(int data){
        SNode newnode = new SNode(data);
        if (head == null) head = newnode;
        else{
            SNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newnode;
        }
        size++;
        System.out.println("Inserted Successfully at Last");
    }

    public void insertAtPosition(int data, int pos){
        if (pos<=1)
            insertAtStart(data);
        else if (pos >= size)
            insertAtLast(data);
        else {
            SNode newnode = new SNode(data);
            SNode temp = head;
            for (int i=1; i<pos-1; i++)
                temp = temp.next;
            newnode.next = temp.next;
            temp.next = newnode;
            System.out.println("Inserted Successfully at "+pos);
        }
        size++;
    }

    public void deletionFromStart(){
        if(head == null)
            System.out.println("Empty Linked List");
        else {
            head = head.next;
            size--;
            System.out.println("Deleted Successfully from Start");
        }
    }

    public void deletionFromLast() {
        if (head == null)
            System.out.println("Empty Linked List");
        else if (size==1){
            head = null;
            size--;
            System.out.println("Deleted Successfully from Last");
        }
        else{
            SNode temp = head;
            while(temp.next.next!=null)
                temp=temp.next;
            temp.next = null;
            size--;
            System.out.println("Deleted Successfully from Last");
        }
    }

    public void DeleteFromPosition(int pos){
        if (pos <= 1)
            deletionFromStart();
        else if (pos >= size)
            deletionFromLast();
        else{
            SNode temp = head;
            for (int i = 1; i < pos - 1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            size--;
            System.out.println("Deleted Successfully from "+pos);
        }
    }

    //    public void positionAccess(int pos){
//        if (pos <= 1) {
//            System.out.print("Data found at position 1 = "+head.data);
//        }
//        else {
//            SNode temp = head;
//            for (int i = 1; i < pos - 1; i++) {
//                if (i > size-1)
//                    break;
//                temp = temp.next;
//            }
//            System.out.print("Data found at position "+pos+" = "+head.data);
//        }
//    }
    public int positionAccess(int pos){
        if (pos <= 1) {
            return head.data;
        }
        else {
            SNode temp = head;
            for (int i = 0; i < pos - 1; i++) {
                if (i > size-1)
                    break;
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public void dataAccess(int data){
        if (head == null)
            System.out.println("Empty Linked List");
        else{
            boolean flag = false;
            SNode temp = head;
            while(temp != null) {
                if (temp.data == data) {
                    flag = true;
                    System.out.println("Data Found");
                    break;
                }
                temp=temp.next;
            }
            if(!flag)
                System.out.println("Data Not Found");
        }
    }

    public void display() {
        if (head == null)
            System.out.println("!Empty!");
        else {
            SNode temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public int count() {
//        SNode temp = head;
//        int ctr = 0;
//        while (temp != null) {
//            ctr++;
//            temp = temp.next;
//        }
//        return ctr;
        return size;
    }
}
