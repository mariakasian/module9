package collections.myStack;

class NodeS<T> {
    private T value;
    private NodeS<T> next;

    public NodeS(T value) {
        this.value = value;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public NodeS<T> getNext() {
        return next;
    }

    public void setNext(NodeS<T> next) {
        this.next = next;
    }
}
