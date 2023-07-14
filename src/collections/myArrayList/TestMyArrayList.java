package collections.myArrayList;

import collections.IllegalIndexOutOfBoundsException;

public class TestMyArrayList {
    public static void main(String[] args) throws IllegalIndexOutOfBoundsException {

        System.out.println("Перевірка MyArrayList:");
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        System.out.println("Додаю елементи.");
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }

        System.out.println("=======================");

        System.out.println("myArrayList.size() = " + myArrayList.size());
        System.out.println("myArrayList.get(2) = " + myArrayList.get(2));

        System.out.println("=======================");

        System.out.println("Видаляю елемент за індексом.");
        myArrayList.remove(2);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }

        System.out.println("=======================");

        System.out.println("Видаляю всі елементи.");
        myArrayList.clear();
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println("myArrayList.get(" + i + ") = " + myArrayList.get(i));
        }

        System.out.println("=======================");

//        System.out.println("Перевіряю невалідні індекси.");
//        System.out.println("myArrayList.get(-6) = " + myArrayList.get(-6));
//        System.out.println("myArrayList.get(16) = " + myArrayList.get(16));
//            myArrayList.remove(-4);

    }
}
