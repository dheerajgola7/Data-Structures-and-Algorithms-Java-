package Queue;

import Linked_List.Nodes.PriorityNode;

public class PriorityQueueLinkedList {
    /*
    A priority queue is a data structure in which each element is assigned a priority.The priority of all element
    will be used to determine the order in which the element will be processed.
    The general rules of processing the elements of a priority queue are
    1) An element with higher priority is processed before an element with lower priority
    2) The elements with same priority are processed on a FCFS basis
    Basic applications are
    1) Bandwidth Management
    2) Discrete event simulation
    3) Haffman Coding
    4) best first search algorithm
    5) pri's algorithms for minimumm spanning tree
    Two types of Priority Queue
    1) Assending priority queue
    2) Descending priority queue
    */

    PriorityNode front;
    PriorityNode rear;

    public PriorityQueueLinkedList() {
        front = null;
        rear = null;
    }

    public void enqueue(PriorityNode newnode) {
        if (front == null || newnode.getPriority() < front.getPriority()) {
            newnode.setNext(front);
            front = newnode;
        } else {
            PriorityNode temp = front;

            while (temp.getNext() != null && temp.getNext().getPriority() <= newnode.getPriority()) {
                temp = temp.getNext();
            }
            newnode.setNext(temp.getNext());
            temp.setNext(newnode);

        }
    }

    public void display()
    {
        PriorityNode temp = front;
        while(temp != null)
        {
            System.out.println(temp.getData() + " " + temp.getPriority());
            temp = temp.getNext();
        }
    }
}

class Implementation{
    public static void main(String[] args) {
        // Creation of the node class object
        PriorityNode n1= new PriorityNode(15,4);
        PriorityNode n2 = new PriorityNode(10,3);
        PriorityNode n3 = new PriorityNode(20,3);
        PriorityQueueLinkedList obj = new  PriorityQueueLinkedList();
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.display();
    }
}