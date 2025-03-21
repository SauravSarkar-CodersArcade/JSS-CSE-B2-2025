package Greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ChocolateDistribution {
    public long findMinDiff(ArrayList<Long> a, long n, long m){
        // Sort the array
        Collections.sort(a);
        int i = 0;
        int j = (int) m - 1;
        long mini = Long.MAX_VALUE;
        // Sliding window approach
        while (j < n){
            long diff = a.get(j) - a.get(i);
            mini = Math.min(mini, diff);
            i++;
            j++;
        }
        return mini;
    }

    public static void main(String[] args) {
        ChocolateDistribution obj = new ChocolateDistribution();
        ArrayList<Long> arr = new ArrayList<>
                (Arrays.asList(7L,3L,2L,4L,9L,12L,56L));
        long n = arr.size();
        long m = 3; // Number of students
        System.out.println("Minimum Difference: " +
                obj.findMinDiff(arr,n,m));

    }
}
