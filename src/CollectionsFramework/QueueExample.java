package CollectionsFramework;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> integers = new LinkedList<>();
        integers.offer(10);
        integers.offer(20);
        integers.offer(30);
        System.out.println("Queue: " + integers);
        System.out.println("Front Element: " + integers.peek());
        integers.poll(); // Removes the front element
        System.out.println("After Poll: " + integers);
    }
}
