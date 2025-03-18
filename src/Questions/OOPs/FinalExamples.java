package Questions.OOPs;

public class FinalExamples {
    final int y = 10;
    // y = 100; Not allowed
    final int x;
    static final int z;
    FinalExamples(){
        x = 100;
    }

    public static void main(String[] args) {
        new FinalExamples();
        System.out.println("JSS");

    }
    static {
        z = 200;
        System.out.println("Start");
    }
    {
        // IIB -> Instance Initializer Block
        System.out.println("IIB");
    }
}
