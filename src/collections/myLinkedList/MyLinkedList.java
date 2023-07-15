package collections.myLinkedList;

public class MyLinkedList<T> {
    private int size = 0;
    private NodeLL<T> firstNode;
    private NodeLL<T> lastNode;

    public MyLinkedList() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }
    public void add(T value) {
        if (firstNode == null) {
            firstNode = new NodeLL<>(null, null, value);
            lastNode = firstNode;
            size++;
        } else {
            NodeLL<T> node = new NodeLL<>(firstNode, null, value);
            lastNode.setNextNode(node);
            lastNode = node;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        validateIndex(index);

        NodeLL<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public void remove(int index) {
        validateIndex(index);

        NodeLL<T> nodeToRemove;

        if (index == 0) {
            nodeToRemove = firstNode;
            firstNode = firstNode.getNextNode();
        } else {
            NodeLL<T> currentNode = firstNode;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNextNode();
            }
            nodeToRemove = currentNode.getNextNode();
            currentNode.setNextNode(nodeToRemove.getNextNode());
        }

        if (nodeToRemove.getNextNode() != null) {
            nodeToRemove.getNextNode().setPrevNode(nodeToRemove.getPrevNode());
        } else {
            lastNode = nodeToRemove.getPrevNode();
        }

        nodeToRemove.setPrevNode(null);
        nodeToRemove.setNextNode(null);

        size--;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Невалідний індекс: " + index);
        }
    }
}

