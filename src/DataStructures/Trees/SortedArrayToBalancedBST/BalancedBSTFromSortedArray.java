package DataStructures.Trees.SortedArrayToBalancedBST;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int val){
        this.data = val;
        this.left = this.right = null;
    }
}
public class BalancedBSTFromSortedArray {
    static TreeNode sortedArrayToBalancedBST(int[] arr, int s, int e){
        if(s > e){
            return null;
        }
        int mid = s + (e-s)/2;
        TreeNode root = new TreeNode(arr[mid]);
        // Recursive call for the left side of the array
        root.left = sortedArrayToBalancedBST(arr,s,mid-1);
        // Recursive call for the right side of the array
        root.right = sortedArrayToBalancedBST(arr,mid+1,e);
        return root;
    }
    static void inOrderTraversal(TreeNode root){
        if(root != null){
            // LDR
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        TreeNode root = sortedArrayToBalancedBST(arr,0,n-1);
        System.out.println("InOrderTraversal: ");
        inOrderTraversal(root);
        System.out.println();
    }
}
