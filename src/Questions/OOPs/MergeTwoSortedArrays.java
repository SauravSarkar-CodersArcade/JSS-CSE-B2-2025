package Questions.OOPs;
import java.util.Arrays;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] array1 = {1,3,5,7,9};
        int[] array2 = {2,4,6};
        int[] mergedArray = mergeTwoSortedArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
    }
    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i=0, j=0, k=0;
        while (i<n1 && j<n2){
            if(arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }else {
                merged[k++] = arr2[j++];
            }
        }
        while (i < n1){
            merged[k++] = arr1[i++];
        }
        while (j < n2){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
