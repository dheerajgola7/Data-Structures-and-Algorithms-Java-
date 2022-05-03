package Linked_List.Nodes;

public class DNode {
    public int data;
    public DNode next; //Self-Referencing
    public DNode prev; //Self-Referencing

    //Polymorphism
    public DNode(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
    public DNode(){
        prev = null;
        next = null;
    }
}
