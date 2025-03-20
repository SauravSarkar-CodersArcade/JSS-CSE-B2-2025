package DataStructures.Trees.ImplementationAndTraversals;
public class GenericTree <X> {
    private final X data; // final is optional
    private GenericTree<X> left;
    private GenericTree<X> right;
    public GenericTree(X data){
        this.data = data;
        this.left = this.right = null;
    }
    void preOrder(){
        System.out.print(this.data + " ");
        if(this.left != null) this.left.preOrder();
        if(this.right != null) this.right.preOrder();
    }
    void inOrder(){
        if(this.left != null) this.left.inOrder();
        System.out.print(this.data + " ");
        if(this.right != null) this.right.inOrder();
    }
    void postOrder(){
        if(this.left != null) this.left.postOrder();
        if(this.right != null) this.right.postOrder();
        System.out.print(this.data + " ");
    }

    public static void main(String[] args) {
        GenericTree<Integer> root = new GenericTree<>(1);
        root.left = new GenericTree<>(2);
        root.right = new GenericTree<>(3);
        System.out.print("PreOrder: ");
        root.preOrder();
        System.out.println();
        System.out.print("InOrder: ");
        root.inOrder();
        System.out.println();
        System.out.print("PostOrder: ");
        root.postOrder();
        System.out.println();
        GenericTree<String> tree = new GenericTree<>("JSS");
        GenericTree<Double> tree1 = new GenericTree<>(1.25);
        GenericTree<Float> tree2 = new GenericTree<>(1.45F);
    }
}
