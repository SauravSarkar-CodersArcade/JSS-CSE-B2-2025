package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> nodes m -> edges
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Adjacency List representation
        List<List<Integer>> adjList = new ArrayList<>();
        // Initialize adjacency list with empty lists for each node
        for (int i=0; i<=n; i++){ //It will work for both 0 & 1
            adjList.add(new ArrayList<>());
        }
        // Read the edges & update the list
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected Graph u <-> v
            adjList.get(u).add(v);
            // adjList.get(v).add(u); // Skip this for directed
        }
        // Print the Adjacency List
        for(int i=1; i<= n; i++){
            System.out.print("Node -> " + i + " Neighbours:-> ");
            for (int v : adjList.get(i)){
                System.out.print(v + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
