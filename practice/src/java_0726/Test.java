package java_0726;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
            Integer i = it.next();
            System.out.println(i);
        }
    }
}
