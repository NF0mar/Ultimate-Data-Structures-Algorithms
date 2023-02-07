package Projects;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(30);
        list.addLast(50);
        list.addFirst(90);
        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(50));
        System.out.println(list);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
