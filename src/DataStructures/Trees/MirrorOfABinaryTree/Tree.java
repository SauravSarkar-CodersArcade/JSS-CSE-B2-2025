package DataStructures.Trees.MirrorOfABinaryTree;
public class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data){
        this.data = data;
        this.left = this.right = null;
    }
    private static void inOrderTraversal(Tree root){ // LDR
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    public static Tree mirrorTree(Tree root){
        // Base case: tree is empty
        if(root == null){
            return null;
        }
        // Swap the left & right children
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        // Do it recursively to swap all the children nodes
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(2);
        root.right = new Tree(3);
        root.left.left = new Tree(4);
        root.left.right = new Tree(5);
        root.right.left = new Tree(6);
        root.right.right = new Tree(7);
        System.out.println("Original Tree: ");
        inOrderTraversal(root);
        System.out.println();
        System.out.println("Mirror Tree: ");
        root = mirrorTree(root);
        inOrderTraversal(root);
    }
}
