package collections.myHashMap;

import collections.myStack.MyStack;

public class TestMyHashMap {
    public static void main(String[] args) {
        System.out.println("Перевірка MyHashMap:");
        MyHashMap<Integer, Integer> hashMap = new MyHashMap();

//        System.out.println("Додаю елементи.");
        for (int i = 0; i < 1000010; i++) {
            hashMap.put(i, i);
        }

        System.out.println("=======================");

        System.out.println("Перевіряю метод size().");

        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("=======================");

        System.out.println("Перевіряю метод get(K key).");

        for (int i  = 0; i < 10; i++) {
            System.out.println("hashMap.get(" + i + ") = " + hashMap.get(i));
        }
        System.out.println("...");
        for (int i  = 1000000; i < 1000010; i++) {
            System.out.println("hashMap.get(" + i + ") = " + hashMap.get(i));
        }

        System.out.println("=======================");

        System.out.println("Перевіряю невалідний ключ для методу get(K key).");

        System.out.println("hashMap.get(-5) = " + hashMap.get(-5));

        System.out.println("=======================");

        System.out.println("Перевіряю метод remove(K key).");

        hashMap.remove(2);
        System.out.println("hashMap.size() = " + hashMap.size());
        for (int i  = 0; i < 6; i++) {
            System.out.println("hashMap.get(" + i + ") = " + hashMap.get(i));
        }

        System.out.println("=======================");

        System.out.println("Перевіряю метод clear().");

        hashMap.clear();
        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("=======================");
    }
}
