package collections.myLinkedList;

import collections.myLinkedList.MyLinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {

        System.out.println("Перевірка MyLinkedList:");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        System.out.println("Додаю елементи.");
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println("myLinkedList.get(" + i + ") = " + myLinkedList.get(i));
        }

        System.out.println("=======================");

        System.out.println("myLinkedList.size() = " + myLinkedList.size());
        System.out.println("myLinkedList.get(2) = " + myLinkedList.get(2));

        System.out.println("=======================");

        System.out.println("Видаляю елемент за індексом.");
        myLinkedList.remove(2);
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.println("myLinkedList.get(" + i + ") = " + myLinkedList.get(i));
        }

        System.out.println("=======================");

        System.out.println("Видаляю всі елементи.");
        myLinkedList.clear();
        System.out.println("myLinkedList.size() = " + myLinkedList.size());

        System.out.println("=======================");

//        System.out.println("Перевіряю невалідні індекси.");
//        System.out.println("myLinkedList.get(-6) = " + myLinkedList.get(-6));
//        System.out.println("myLinkedList.get(16) = " + myLinkedList.get(16));
//            myLinkedList.remove(-4);

    }
}
