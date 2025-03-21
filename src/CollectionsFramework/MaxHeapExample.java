package CollectionsFramework;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(2);
        maxHeap.add(20);
        // 20 10 5 2
        System.out.println("MaxHeap " + maxHeap);
        System.out.println("largest element: " + maxHeap.poll());
    }
}
