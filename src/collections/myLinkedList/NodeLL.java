package collections.myLinkedList;

public class NodeLL<T> {
    private NodeLL<T> prevNode;
    private NodeLL<T> nextNode;
    private T value;

    public NodeLL(NodeLL<T> prevNode, NodeLL<T> nextNode, T value) {
        this.prevNode = prevNode;
        this.nextNode = nextNode;
        this.value = value;
    }

    public NodeLL<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(NodeLL<T> prevNode) {
        this.prevNode = prevNode;
    }

    public NodeLL<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NodeLL<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getValue() {
        return value;
    }
}
