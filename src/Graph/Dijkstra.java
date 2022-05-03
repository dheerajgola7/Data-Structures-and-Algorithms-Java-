package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {
    public static void dijkstra(int[][] graph, int src){
        int[] dist = new int[graph[0].length];
        Boolean[] vis = new Boolean[graph[0].length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Arrays.fill(vis, false);
        dist[src] = 0;
        for(int count=0; count<graph[0].length-1; count++){
            int u = minDistance(dist, vis);
            vis[u] = true;
            for(int v=0; v<graph[0].length; v++)
                if(!vis[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < dist.length; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public static int minDistance(int[] dist, Boolean[] vis){
        int min = Integer.MAX_VALUE, min_index = -1;
        for(int v=0; v<dist.length; v++)
            if(vis[v]==false && dist[v] <= min){
                min = dist[v];
                min_index = v;
            }
        return min_index;
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO SINGLE SOURCE SHORTEST PATH PROGRAM USING DIJKSTRA ALGORITHM");
        System.out.print("\nPlease enter the number of vertex in your graph: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] graph = new int[size][size];
        System.out.println("Please enter the adjacency matrix of graph: ");
        for(int i=0; i<size; i++)
            for (int j=0; j<size; j++)
                graph[i][j] = sc.nextInt();
        dijkstra(graph, 0);
    }
}
