package Linked_List.SinglyGLL;

import Linked_List.Nodes.GSNode;

public class GenericLL<T> {
    private int size = 0;
    private GSNode<T> node;

    public void addAtLast(T data) {
        if (data == null) {
            return;
        }
        if (node == null) {
            node = new GSNode<>(data);
        } else {
            GSNode<T> newNode = new GSNode<>(data);
            GSNode<T> lastNode = getLastNode(node);
            lastNode.setNode(newNode);
        }
        size++;
    }

    public void addAtFirst(T data) {
        if (data == null) {
            return;
        }
        GSNode<T> newNode = new GSNode<>(data);
        if (this.node != null) {
            newNode.setNode(this.node);
            this.node = newNode;
        } else {
            this.node = newNode;
        }
        size++;
    }

    public void addAtPos(int index, T data) throws IndexOutOfBoundsException {
        if (data == null) {
            return;
        }
        if (index == 0) {
            addAtFirst(data);
            return;
        }
        if (index == this.size) {
            addAtLast(data);
        } else if (index < this.size) {
            GSNode<T> newNode = new GSNode<>(data);
            GSNode<T> leftNode = getNode(index - 1);
            GSNode<T> rightNode = getNode(index);
            newNode.setNode(rightNode);
            leftNode.setNode(newNode);
            size++;
        } else {
            throw new IndexOutOfBoundsException("Index not available.");
        }
    }


    public GSNode<T> getNode(int index) {
        if (index < 0 || index > this.size - 1) {
            System.out.println("Invalid Position");
        }
        if (index == 0) {
            return this.node;
        }
        if (index == this.size - 1) {
            return getLastNode(this.node);
        }
        int pointer = 0;
        GSNode<T> pointerNode = this.node;
        while (pointer <= index) {
            if (pointer == index) {
                return pointerNode;
            } else {
                pointerNode = next(pointerNode);
                pointer++;
            }
        }
        return null;
    }

    public GSNode<T> getLastNode(GSNode<T> node) {
        GSNode<T> lastNode = node;
        if (lastNode.getNode() != null) {
            return getLastNode(lastNode.getNode());
        } else {
            return lastNode;
        }
    }


    public GSNode<T> next(GSNode<T> node) {
        if (node.getNode() != null) {
            return node.getNode();
        } else {
            return null;
        }
    }

    public int size() {
        return this.size;
    }


    @Override
    public String toString() {
        String str = "[";
        GSNode<T> nextNode = this.node;
        while (nextNode != null) {
            str = str + nextNode.toString();
            nextNode = next(nextNode);
            if (nextNode != null) {
                str = str + ",";
            }
        }
        str = str + "]";
        return str;
    }
}
