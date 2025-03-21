package CollectionsFramework;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106,"Vikas");
        ht.put(117,"Nikhil");
        ht.put(128,"Rajat");
        ht.put(99,"Ujjwal");
        ht.put(100,"Suraj");
        ht.put(102,"Sajin");
        for (Map.Entry kv : ht.entrySet()){
            System.out.println(kv.getKey() + " " + kv.getValue());
        }
    }
}
