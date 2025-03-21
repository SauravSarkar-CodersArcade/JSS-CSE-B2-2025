package CollectionsFramework;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveArrayDuplicates {
    public static void main(String[] args) {
        String[] names = {"Vikas", "Rahul", "Sanjana",
        "Sahana", "Vikas", "Rahul", "Sanjana", "Ramya"};
        Set<String> uniqueNames = new
                LinkedHashSet<>(Arrays.asList(names));
        System.out.println("After removing duplicates:");
        System.out.println(uniqueNames);
    }
}
