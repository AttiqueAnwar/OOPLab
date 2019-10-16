import java.util.*;

public class Output {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println(list);
        // Returns the Maximum String
        System.out.println("max: " + Collections.max(list));
        // Returns the Maximum String
        System.out.println("min: " + Collections.min(list));
    }
}