import java.util.*;

public class NumericArray {
    public static void main(String[] args) {
        // creating ArrayList of Integer Type
        ArrayList<Integer> list = new ArrayList<>();
        // Adding Value into ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // Printing The Maximum Value
        System.out.println("Maximum value is: " + Collections.max(list));
        // Printing The Minimum Value
        System.out.println("Minimum Value is: " + Collections.min(list));
    }
}