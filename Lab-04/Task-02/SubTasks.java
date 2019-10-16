import java.util.*;

public class SubTasks {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();
        // Adding values in ArrayList
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        // Printing List
        System.out.println(list);
        // removing specfic object from ArrayList
        list.remove("three");
        // Printing ArrayList after removing object
        System.out.println(list);
        // Reversing the collection
        Collections.reverse(list);
        // printing the ArrayList after reversing
        System.out.println(list);
        // Shuffling the ArrayList
        Collections.shuffle(list);
        // printing the list after shuffle
        System.out.println(list);
        // Creating Read-only ArrayList
        final List<String> list1 = Collections.unmodifiableList(list);
        // printing read only ArrayList
        System.out.println(list1);
    }
}