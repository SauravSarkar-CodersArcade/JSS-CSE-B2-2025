package CollectionsFramework;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(100);
        System.out.println("Deque: " + deque);
        deque.removeLast();
        System.out.println("After removing last: " + deque);
    }
}
