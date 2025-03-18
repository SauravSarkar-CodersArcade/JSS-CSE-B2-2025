package SortingAlgos;
import java.util.Arrays;
public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i=0; i< arr.length-1; i++){
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,2,3,6,1,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
