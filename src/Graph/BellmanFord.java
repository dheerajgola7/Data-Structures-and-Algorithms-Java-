package Graph;

import java.util.Scanner;

public class BellmanFord {
    static class Edge {
        int src, dest, weight;
        Edge()
        {
            src = dest = weight = 0;
        }
    }
    static class Graph {
        int V, E;
        Edge[] edge;
        Graph(int v, int e)
        {
            V = v;
            E = e;
            edge = new Edge[e];
            for (int i = 0; i < e; ++i)
                edge[i] = new Edge();
        }
    }
    static void bellmanFord(Graph graph, int src)
    {
        int V = graph.V, E = graph.E;
        int[] dist = new int[V];
        for (int i = 0; i < V; ++i)
            dist[i] = Integer.MAX_VALUE;
        dist[src] = 0;
        for (int i = 1; i < V; ++i) {
            for (int j = 0; j < E; ++j) {
                int u = graph.edge[j].src;
                int v = graph.edge[j].dest;
                int weight = graph.edge[j].weight;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v])
                    dist[v] = dist[u] + weight;
            }
        }
        for (int j = 0; j < E; ++j) {
            int u = graph.edge[j].src;
            int v = graph.edge[j].dest;
            int weight = graph.edge[j].weight;
            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                System.out.println("Graph contains negative weight cycle.");
                return;
            }
        }
        System.out.println("\nVertex Distance from Source");
        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWELCOME TO SINGLE SOURCE SHORTEST PATH PROGRAM USING BELLMAN-FORD ALGORITHM");
        System.out.print("\nPlease enter the number of vertex in your graph: ");
        int V = sc.nextInt();
        System.out.print("Please enter the number of edges in your graph: ");
        int E = sc.nextInt();
        Graph graph = new Graph(V, E);
        for (int i = 0; i < E; i++) {
            System.out.print("\nPlease enter the source for EDGE "+(i+1)+" : ");
            graph.edge[i].src = sc.nextInt();
            System.out.print("Please enter the destination for EDGE "+(i+1)+" : ");
            graph.edge[i].dest = sc.nextInt();
            System.out.print("Please enter the weight for EDGE "+(i+1)+" : ");
            graph.edge[i].weight = sc.nextInt();
        }
        System.out.print("\nPlease enter the source vertex to find SSSP: ");
        int src = sc.nextInt();
        if(src<V && src>=0)
            bellmanFord(graph, src);
        else
            System.out.println("Invalid Source Vertex!");
    }
}
