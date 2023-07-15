package collections.myArrayList;

import collections.IllegalIndexOutOfBoundsException;

public class TestMyArrayList {
    public static void main(String[] args) throws IllegalIndexOutOfBoundsException {

        System.out.println("Перевірка MyArrayList:");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        System.out.println("Додаю елементи.");
        for (int i = 0; i < 1000010; i++) {
            myArrayList.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }
        System.out.println("...");
        for (int i = 1000000; i < 1000010; i++) {
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }

        System.out.println("=======================");

        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println("=======================");

        System.out.println("Видаляю елемент за індексом.");
        myArrayList.remove(2);
        for (int i = 0; i <= 10; i++) {
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }
        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println("=======================");

        System.out.println("Видаляю всі елементи.");
        myArrayList.clear();
        System.out.println("myArrayList.size() = " + myArrayList.size());

        System.out.println("=======================");

//        System.out.println("Перевіряю невалідні індекси.");
//        System.out.println("myArrayList.get(-6) = " + myArrayList.get(-6));

//            myArrayList.remove(-4);

    }
}
