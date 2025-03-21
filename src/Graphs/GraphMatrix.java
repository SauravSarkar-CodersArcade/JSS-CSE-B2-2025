package Graphs;
import java.util.Scanner;
public class GraphMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n -> nodes m -> edges
        // Time Complexity : O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Adjacency Matrix (1-based indexing)
        int[][] adjMatrix = new int[n + 1][n + 1]; // for 0 based indexing
        // Taking edge inputs
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected u <-> v
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // Skip this for directed, will be 0
        }
        // Print the Adjacency Matrix
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
