import java.util.*;

public class ListCreator {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();
        list.add("Kay");
        list.add("Jay");
        list.add("May");
        list.add("Fay");
        System.out.println(list);
        for (String item : list) {
            System.out.println(list.indexOf(item));
            if (item.equals("May")) {
                list.add(list.indexOf(item), "Ray");
            }
        }
        System.out.println(list);
    }
}