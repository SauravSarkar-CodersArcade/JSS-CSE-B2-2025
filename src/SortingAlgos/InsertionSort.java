package SortingAlgos;
import java.util.Arrays;
public class InsertionSort {
    public static void insertionSort(int[] arr){
        for (int i=1; i< arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                // Shift operation
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8,5,2,9,6,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
