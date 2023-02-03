package Projects;

import java.util.ArrayList;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(70);
//        list.remove(2);
        System.out.println(list.size());
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(50));
    }
}
