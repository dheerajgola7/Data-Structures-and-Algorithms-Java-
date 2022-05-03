package Linked_List.Nodes;

public class PriorityNode {
    private PriorityNode next;
    private int data;
    private int priority;
    public PriorityNode(int data, int priority)
    {
        this.data = data;
        this.priority = priority;
    }

    public PriorityNode getNext() {
        return next;
    }

    public void setNext(PriorityNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
