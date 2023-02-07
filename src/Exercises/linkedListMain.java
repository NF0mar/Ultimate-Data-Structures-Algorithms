package Exercises;

public class linkedListMain {
    public static void main(String[] args) {
        var list = new linkedList();
        list.addLast(20);
        list.addFirst(40);
        System.out.println(list.contains(40));
        System.out.println(list.size());
        System.out.println(list.indexOf(20));
        System.out.println(list);
    }
}
