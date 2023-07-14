package collections.myStack;

import collections.myQueue.MyQueue;

public class TestMyStack {
    public static void main(String[] args) {
        System.out.println("Перевірка MyStack:");
        MyStack<Integer> stack = new MyStack<>();

//        System.out.println("Додаю елементи.");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("=======================");

        System.out.println("Перевіряю метод size().");

        System.out.println("stack.size() = " + stack.size());

        System.out.println("=======================");

        System.out.println("Перевіряю метод peek().");

        System.out.println("stack.peek() = " + stack.peek());

        System.out.println("=======================");

        System.out.println("Перевіряю метод pop().");

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.size() = " + stack.size());

        System.out.println("=======================");

        System.out.println("Перевіряю метод remove(int index).");

        stack.remove(2);
        System.out.println("stack.size() = " + stack.size());

        System.out.println("=======================");

        /*System.out.println("Перевірка невалідного індекса у методі remove(int index).");

        stack.remove(-4);
        System.out.println("stack.size() = " + stack.size());

        System.out.println("=======================");*/

        System.out.println("Перевіряю метод clear().");

        stack.clear();
        System.out.println("stack.size() = " + stack.size());

        System.out.println("=======================");
    }
}
