package collections.myQueue;

public class NodeQ<T> {
    private T value;
    private NodeQ<T> next;

    public NodeQ(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public NodeQ<T> getNext() {
        return next;
    }

    public void setNext(NodeQ<T> next) {
        this.next = next;
    }
}