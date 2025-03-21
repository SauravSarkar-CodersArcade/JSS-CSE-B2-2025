package Greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MinimumCoins {
    static void findMinimumCoins(List<Integer> coins, int V){
        List<Integer> result = new ArrayList<>();
        // If the list is not sorted, sort it
        // Traverse the sorted coins from right to left
        for (int i= coins.size()-1; i>=0; i--){
            while (V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.print("Coins selected: ");
        for (int coin : result){
            System.out.print(coin + " ");
        }
        System.out.println();
        System.out.println("Minimum number of coins: "
        + result.size());
    }

    public static void main(String[] args) {
        List<Integer> coins = Arrays.
                asList(1,2,5,10,20,50,100,500,2000);
        int V = 91;
        findMinimumCoins(coins,V);
    }
}
