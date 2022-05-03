package Graph;
/*
Using User Defined Singly Linked List

import Linked_List.SinglyLL.SinglyLL;

import java.util.*;

public class myGraph {
    Map<Integer, SinglyLL> obj; //Declaration
    public myGraph(){
        obj = new HashMap<>();
    }
    public void addEdge(int v1, int v2, boolean isBidirectional){
        SinglyLL v1Neighbour = obj.getOrDefault(v1, new SinglyLL());
        v1Neighbour.insertAtLast(v2);
        obj.put(v1, v1Neighbour);
        if(isBidirectional){
            SinglyLL v2Neighbour = obj.getOrDefault(v2, new SinglyLL());
            v2Neighbour.insertAtLast(v1);
            obj.put(v2, v2Neighbour);
        }
    }
    public void BFSTraversal(int source){
        Queue<Integer> bfs=new LinkedList<>();
        bfs.add(source);
        Set<Integer> vis=new HashSet<>();
        vis.add(source);
        while (!bfs.isEmpty()){
            int front=bfs.poll(); //we can also use bfs.remove()
            System.out.print(front+"\t");
            SinglyLL neighbourList = obj.get(front);
            for (int i=0;i<neighbourList.size;i++) {
                if(!vis.contains(neighbourList.positionAccess(i+1))){
                    bfs.add(neighbourList.positionAccess(i+1));
                    vis.add(neighbourList.positionAccess(i+1));
                }
            }
        }
    }
    public void display() {
        for (Integer i: obj.keySet()) {
            System.out.println("\n");
            System.out.print(i+" => {");
            obj.get(i).display();
            System.out.print("\b}");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        myGraph obj = new myGraph();
        obj.addEdge(1,2,true);
        obj.addEdge(1,3,true);
        obj.addEdge(1,5,true);
        obj.addEdge(2,4,true);
        obj.addEdge(3,4,true);
        obj.addEdge(4,5,true);
        obj.display();
        System.out.println("\n-------------\nBFS Traversal\n-------------");
        obj.BFSTraversal(1);
    }
}
*/

