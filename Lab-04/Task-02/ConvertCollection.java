import java.util.*;

public class ConvertCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        String[] list1 = list.toArray(new String[list.size()]);
        for (String var : list1) {
            System.out.println(var);

        }
    }
}