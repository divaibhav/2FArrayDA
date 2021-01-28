package main;

import implementation.MyArrayImplementation;

public class MyMain {
    public static void main(String[] args) {
        int size = 5;
        MyArrayImplementation numbers =
                new MyArrayImplementation(size);
        numbers.insert(20);
        numbers.insert(2);
        numbers.insert(8);
        numbers.traverse();
        numbers.delete();
        System.out.println();
        numbers.traverse();
    }
}
