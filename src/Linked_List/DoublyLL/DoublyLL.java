package Linked_List.DoublyLL;

import Linked_List.Nodes.DNode;

public class DoublyLL {
    public DNode head;
    public DNode tail;
    public int size = 0;

    public void insertAtStart(int data){
        DNode newnode = new DNode(data);
        if(size==0){
            tail = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
        }
        head = newnode;
        size++;
        System.out.println("Inserted Successfully at Start");
    }

    public void insertAtLast(int data){
        DNode newnode = new DNode(data);
        if (head == null) head = newnode;
        else{
            tail.next = newnode;
            newnode.prev = tail;
        }
        tail = newnode;
        size++;
        System.out.println("Inserted Successfully at Last");
    }

    public void insertAtPosition(int data, int pos){
        if (pos<=1)
            insertAtStart(data);
        else if (pos >= size)
            insertAtLast(data);
        else {
            DNode newnode = new DNode(data);
            DNode temp = head;
            for (int i=1; i<pos-1; i++)
                temp = temp.next;
            newnode.next = temp.next;
            temp.next.prev = newnode;
            temp.next = newnode;
            newnode.prev = temp;
            System.out.println("Inserted Successfully at "+pos);
        }
        size++;
    }

    public void deletionFromStart(){
        if(head == null)
            System.out.println("Empty Linked List");
        else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println("Deleted Successfully from Start");
        }
    }

    public void deletionFromLast() {
        if (head == null)
            System.out.println("Empty Linked List");
        else{
            tail = tail.prev;
            tail.next = null;
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
            DNode temp = head;
            for (int i = 1; i < pos - 1; i++)
                temp = temp.next;
            temp.next.next.prev = temp;
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
            DNode temp = head;
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
            DNode temp = head;
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
            DNode temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void reversePrint() {
        if (head == null)
            System.out.println("!Empty!");
        else {
            DNode temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }

    public int count() {
//        DNode temp = head;
//        int ctr = 0;
//        while (temp != null) {
//            ctr++;
//            temp = temp.next;
//        }
//        return ctr;
        return size;
    }
}
