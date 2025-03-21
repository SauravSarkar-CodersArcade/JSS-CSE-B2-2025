package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphBFS {
    public List<Integer> bfsGraph
            (int V, List<List<Integer>> adjList){
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V+1]; // )-Based Indexing
        Queue<Integer> q = new LinkedList<>();
        // Start BFS from starting node = 1
        visited[1] = true;
        q.add(1);
        while (!q.isEmpty()){
            int node = q.poll();
            bfs.add(node);
            // Traverse all it's neighbours
            for(int neighbour : adjList.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}
public class BFSGraph {
    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adjList = new ArrayList<>();
        // Initialize adjacency list
        for (int i=0; i<=V; i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList, 1,2);
        addEdge(adjList, 1,3);
        addEdge(adjList, 2,3);
        addEdge(adjList, 2,4);
        addEdge(adjList, 3,4);
        addEdge(adjList, 3,5);
        addEdge(adjList, 4,5);
        GraphBFS obj = new GraphBFS();
        List<Integer> ans = obj.bfsGraph(V, adjList);
        printBFS(ans);
    }
    public static void addEdge
            (List<List<Integer>>adjList, int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public static void printBFS(List<Integer> ans){
        for (int num : ans){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
