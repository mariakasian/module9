package collections.myQueue;

public class TestMyQueue {
    public static void main(String[] args) {
        System.out.println("Перевірка MyQueue:");
        MyQueue<Integer> queue = new MyQueue<>();

//        System.out.println("Додаю елементи.");
        for (int i = 0; i < 1000010; i++) {
            queue.add(i);
        }

        System.out.println("=======================");

        System.out.println("Перевіряю метод size().");

        System.out.println("queue.size() = " + queue.size());

        System.out.println("=======================");

        System.out.println("Перевіряю метод peek().");

        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("=======================");
        System.out.println("Перевіряю метод poll().");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println("queue.size() = " + queue.size());
        System.out.println("queue.peek() = " + queue.peek());

        System.out.println("=======================");

        System.out.println("Перевіряю метод clear().");

        queue.clear();
        System.out.println("queue.size() = " + queue.size());

        System.out.println("=======================");
        /*System.out.println("Перевіряю невалідну ситуацію.");

        System.out.println("queue.peek() = " + queue.peek());*/

    }
}
