package collections.myLinkedList;

import collections.myLinkedList.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {

        System.out.println("Перевірка MyLinkedList:");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        System.out.println("Додаю елементи.");
        for (int i = 0; i < 1000010; i++) {
            myLinkedList.add(i);
        }

        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        for (int i = 0; i < 10; i++) {
            System.out.println("myLinkedList.get(" + i + ") = " + myLinkedList.get(i));
        }
        System.out.println("...");
        for (int i = 1000000; i < 1000010; i++) {
            System.out.println("myLinkedList.get(" + i + ") = " + myLinkedList.get(i));
        }

        System.out.println("=======================");

        System.out.println("Видаляю елемент за індексом.");
        myLinkedList.remove(2);
        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        for (int i = 0; i < 6; i++) {
            System.out.println("myLinkedList.get(" + i + ") = " + myLinkedList.get(i));
        }

        System.out.println("=======================");

        System.out.println("Видаляю всі елементи.");
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("=======================");

//        System.out.println("Перевіряю невалідні індекси.");
//        System.out.println("myLinkedList.get(-6) = " + myLinkedList.get(-6));

//        myLinkedList.remove(-4);

    }
}
