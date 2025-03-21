package CollectionsFramework;
import java.util.PriorityQueue;
public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(2);
        minHeap.add(20);
        // 2 5 10 20
        System.out.println("MinHeap " + minHeap);
        System.out.println("Smallest element: " + minHeap.poll());
    }
}
