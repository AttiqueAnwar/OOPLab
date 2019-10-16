import java.util.*;

public class ConvertArray {
    public static void main(String[] args) {
        String[] arr = { "one", "two", "three", "four", "five", "six" };
        ArrayList<String> list = new ArrayList<>();
        for (String val : arr) {
            list.add(val);
        }
        System.out.println(list);
    }
}