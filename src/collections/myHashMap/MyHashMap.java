package collections.myHashMap;

public class MyHashMap<K, V> {
    private NodeHash<K, V>[] buckets;
    private int size;
    private static final int CAPACITY = 16;
    private int index; //індекс баккета

    public MyHashMap() {
        buckets = new NodeHash[CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        NodeHash<K, V> newNode = new NodeHash<>(key, value);
        index = Math.abs(key.hashCode() % buckets.length);
        if (buckets[index] == null) {
            buckets[index] = newNode;
            size++;
        } else {
            NodeHash<K, V> currentNode = buckets[index];
            while (currentNode != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    return;
                }
                if (currentNode.getNext() == null) {
                    currentNode.setValue((V) newNode);;
                    size++;
                    return;
                }
                currentNode = currentNode.getNext();
            }
        }
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        index = Math.abs(key.hashCode() % buckets.length);
        NodeHash<K, V> currentNode = buckets[index];
        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public void remove(K key) {
        index = Math.abs(key.hashCode() % buckets.length);

        NodeHash<K, V> currentNode = buckets[index];
        NodeHash<K, V> prevNode = null;

        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                if (prevNode == null) {
                    buckets[index] = currentNode.getNext();
                } else {
                    currentNode = currentNode.getNext();
                }
                size--;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    public void clear() {
        buckets = new NodeHash[CAPACITY];
        size = 0;
    }
}