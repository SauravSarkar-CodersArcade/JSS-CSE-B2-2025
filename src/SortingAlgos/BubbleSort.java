package SortingAlgos;
import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        for (int i=1; i< arr.length; i++){ // Iterations
            for (int j=0; j< arr.length-1; j++){ // Go till second last
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,6,4,3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
