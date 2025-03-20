package DataStructures.Trees.ImplementationAndTraversals.DFS;
public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
    public static void preOrderTraversal(TreeNode root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    public static void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public static void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);
        System.out.println("PreOrderTraversal: ");
        preOrderTraversal(root);
        System.out.println();
        System.out.println("InOrderTraversal: ");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("PostOrderTraversal: ");
        postOrderTraversal(root);
        System.out.println();
    }
}
