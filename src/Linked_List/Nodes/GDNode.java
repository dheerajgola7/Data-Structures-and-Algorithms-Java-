package Linked_List.Nodes;

public class GDNode<T> {
    T data;
    GDNode<T> next;
    GDNode<T> prev;

    //Polymorphism
    public GDNode(T data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public GDNode() {
        next = null;
        prev = null;
    }
}
