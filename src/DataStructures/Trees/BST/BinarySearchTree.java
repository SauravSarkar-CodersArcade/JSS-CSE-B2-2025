package DataStructures.Trees.BST;
class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int value){
        data = value;
        left = null;
        right = null;
    }
}
public class BinarySearchTree {
    static void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if (root == null){
            return new TreeNode(key); // Create a new node & return
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }
        if(root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode current = root;
        while (current != null && current.left != null){
            current = current.left;
        }
        return current;
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else{
            // Only one child
            if(root.left == null){ // Left child doesn't exist
                TreeNode temp = root.right;
                root = null;
                return temp;
            }else if(root.right == null){ // Right child doesn't exist
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // Node with 2 children
            // Find the inorder successor to replace the root node
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        insert(root,30);
        insert(root,40);
        insert(root,80);
        insert(root,70);
        insert(root,10);
        insert(root, 90);
        System.out.println("InOrderTraversal: ");
        inOrderTraversal(root);
        System.out.println();
        int key = 900;
        TreeNode result = search(root,key);
        if(result == null){
            System.out.println(key + " not found in BST");
        }else {
            System.out.println(key + " found in BST");
        }
        System.out.println("\nDelete 30");
        root = deleteNode(root,30);
        System.out.println("InOrderTraversal: ");
        inOrderTraversal(root);
        System.out.println();

        System.out.println("\nDelete 50");
        root = deleteNode(root,50);
        System.out.println("InOrderTraversal: ");
        inOrderTraversal(root);
        System.out.println();
    }
}
