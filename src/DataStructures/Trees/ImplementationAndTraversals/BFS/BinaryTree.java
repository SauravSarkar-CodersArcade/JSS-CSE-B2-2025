package DataStructures.Trees.ImplementationAndTraversals.BFS;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x){
        val = x;
        left = right = null;
    }
}
public class BinaryTree {
    static void levelOrderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            // Left side / subtree
            if(node.left != null){
                queue.add(node.left);
            }
            // Right side/ subtree
            if(node.right != null){
                queue.add(node.right);
            }
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
        System.out.println("Level Order Traversal:  ");
        levelOrderTraversal(root);
    }
}
