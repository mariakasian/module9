package collections.myHashMap;

import collections.myStack.MyStack;

public class TestMyHashMap {
    public static void main(String[] args) {
        System.out.println("Перевірка MyHashMap:");
        MyHashMap<String, Integer> hashMap = new MyHashMap();

//        System.out.println("Додаю елементи.");
        hashMap.put("Tree", 100);
        hashMap.put("Dog", 80);
        hashMap.put("Cat", 70);
        hashMap.put("Snow", 30);
        hashMap.put("Rain", 50);

        System.out.println("=======================");

        System.out.println("Перевіряю метод size().");

        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("=======================");

        System.out.println("Перевіряю метод get(K key).");

        System.out.println("hashMap.get(\"Rain\") = " + hashMap.get("Rain"));

        System.out.println("=======================");

        System.out.println("Перевіряю невалідний ключ для методу get(K key).");

        System.out.println("hashMap.get(\"Fish\") = " + hashMap.get("Fish"));

        System.out.println("=======================");

        System.out.println("Перевіряю метод remove(K key).");

        hashMap.remove("Snow");
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.get(\"Cat\") = " + hashMap.get("Cat"));
        System.out.println("hashMap.get(\"Snow\") = " + hashMap.get("Snow"));
        System.out.println("hashMap.get(\"Rain\") = " + hashMap.get("Rain"));

        System.out.println("=======================");

        System.out.println("Перевіряю метод clear().");

        hashMap.clear();
        System.out.println("hashMap.size() = " + hashMap.size());

        System.out.println("=======================");
    }
}
