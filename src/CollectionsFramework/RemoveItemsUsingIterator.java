package CollectionsFramework;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveItemsUsingIterator {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(21);
        integers.add(13);
        integers.add(9);
        integers.add(11);
        integers.add(17);
        System.out.println("Before: " + integers);
        Iterator<Integer> it = integers.iterator();
//        while (it.hasNext()){
//            Integer i = it.next();
//            if(i < 10){
//                it.remove();
//            }
//        }
        // ->
        integers.removeIf(n -> n > 10); // Lambda Expressions
        System.out.println("After: " + integers);
    }
}
