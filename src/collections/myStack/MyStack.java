package collections.myStack;

public class MyStack<T> {
    private NodeS<T> top = null;
    private int size = 0;

    public void push(T value) {
        NodeS<T> newNode = new NodeS<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Невалідний індекс: " + index);
        }

        if (index == 0) {
            top = top.getNext();
        } else {
            NodeS<T> current = top;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            NodeS<T> nextNode = current.getNext();
            current.setNext(nextNode.getNext());
        }

        size--;
    }

    public void clear() {
        top = null;
        size = 0;
    }



    public T peek() {
        if (top != null) {
            return top.getValue();
        }
        return null;
    }

    public T pop() {
        if (top != null) {
            T value = top.getValue();
            top = top.getNext();
            size--;
            return value;
        }
        return null;
    }
}