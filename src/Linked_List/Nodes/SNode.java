package Linked_List.Nodes;

public class SNode {
    public int data;
    public SNode next; //Self-Referential

    //Polymorphism
    public SNode(int data) {
        this.data = data;
        next = null;
    }

    public SNode() {
        next = null;
    }
}
