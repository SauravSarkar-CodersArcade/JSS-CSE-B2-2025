package BackTracking;

import java.util.Scanner;

public class RatInMaze {
    static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    static boolean ratInMaze(int[][] arr, int x, int y, int n,
                             int[][] resultantArray){
        // Base Case: If rat has already reached destination:
        if(x == n-1 && y == n-1){
            resultantArray[x][y] = 1;
            return true;
        }
        // Check if the rat can stand on the current cell (x,y)
        if(isPathSafe(arr,x,y,n)){
            resultantArray[x][y] = 1;
            // Move forward to find a path
            if(ratInMaze(arr,x+1,y,n,resultantArray)){
                return true;
            }
            // Else, move downward to find a path
            if(ratInMaze(arr,x,y+1,n,resultantArray)){
                return true;
            }
            // We could not find a path, so we backtrack
            resultantArray[x][y] = 0; // BackTracking
            return false;
        }
    return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        // Input array(Maze) -> n x n
        int[][] arr = new int[n][n];
        System.out.println("Enter the Maze values:(0s or 1s):");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Take a resultant array nxn of zeroes
        int[][] resultantArray = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                resultantArray[i][j] = 0;
            }
        }
        if(ratInMaze(arr,0,0,n,resultantArray)){
            // If it's true there is a path, print the o/p
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("No Path for the Rat in the Maze exists.");
        }
    }
}
