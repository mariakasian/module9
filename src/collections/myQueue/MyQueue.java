package collections.myQueue;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private NodeQ<T> first;
    private NodeQ<T> last;
    private int size = 0;

    public void add(T value) {
        NodeQ<T> newNode = new NodeQ<>(value);
        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        size++;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (size == 0) {
            throw new NoSuchElementException("Черга пуста.");
        }
        return first.getValue();
    }

    public T poll() {
        if (size == 0) {
            throw new NoSuchElementException("Черга пуста.");
        }
        T value = first.getValue();
        first = first.getNext();
        size--;
        if (size == 0) {
            last = null;
        }
        return value;
    }
}