package Linked_List.Nodes;

public class GSNode<T> {
    private T data ;
    private GSNode<T> node;

    public GSNode(T data) {
        this.data = data;
    }

    public GSNode<T> getNode() {
        return node;
    }

    public void setNode(GSNode<T> node) {
        this.node = node;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data+" ";
    }
}
