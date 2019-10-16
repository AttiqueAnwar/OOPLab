import java.util.*;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add("F");
        al.add("G");
        al.add("H");
        ListIterator<String> iter = al.listIterator();
        while (iter.hasNext()) {
            String val = iter.next() + "+";
            al.set(value, val);
            value++;
        }
        iter = al.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }

        System.out.println("____________________________");
        System.out.println("Now in reverse order");
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }

    }
}