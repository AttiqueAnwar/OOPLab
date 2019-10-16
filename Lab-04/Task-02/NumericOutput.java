import java.util.*;

public class NumericOutput {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1 2 3 4 5 6 1 3 4".split(" "));
        System.out.println(list);
        // Returns the Maximum String
        System.out.println("max: " + Collections.max(list));
        // Returns the Maximum String
        System.out.println("min: " + Collections.min(list));
    }
}