package DataStructures.Trees.IdenticalTrees;
class Node {
    int value;
    Node left;
    Node right;
    Node(int val){
        value = val;
        left = null;
        right = null;
    }
}
class IdenticalTrees {
    public static boolean areIdentical(Node tree1, Node tree2){
        if(tree1 == null && tree2 == null){
            return true;
        }
        if(tree1 == null || tree2 == null){
            return false;
        }
        if(tree1.value != tree2.value){
            return false;
        }
        return areIdentical(tree1.left, tree2.left) &&
        areIdentical(tree1.right, tree2.right);
    }

    public static void main(String[] args) {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);

        Node tree2 = new Node(1);
        tree2.left = new Node(2);
        tree2.right = new Node(3);

        Node tree3 = new Node(4);
        tree3.left = new Node(5);
        tree3.right = new Node(6);

        Node tree4 = new Node(1);
        tree4.left = new Node(2);
        tree4.right = new Node(5);

        if(areIdentical(tree1,tree2)){
            System.out.println("Identical");
        }else {
            System.out.println("Not Identical");
        }
        if(areIdentical(tree3,tree4)){
            System.out.println("Identical");
        }else {
            System.out.println("Not Identical");
        }
    }
}
