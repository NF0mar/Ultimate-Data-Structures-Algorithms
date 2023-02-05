package Exercises;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(5);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(50);
        numbers.insert(90);
        numbers.insert(40);
        numbers.removeAt(2);

        numbers.print();
    }
}
