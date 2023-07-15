package collections.myArrayList;

import collections.IllegalIndexOutOfBoundsException;

import java.util.Arrays;

public class MyArrayList<T> {
    private  Object[] values = new Object[8];
    private int amountElements = 0;
    public void add(T value) {
        if (amountElements == values.length) {
            values = Arrays.copyOf(values, values.length + 8);
        }
        values[amountElements] = value;
        amountElements++;
    }
    public Object get(int index) throws IllegalIndexOutOfBoundsException {
        try {
            return (T) values[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalIndexOutOfBoundsException("Невалідний індекс: " + index);
        }
    }
    public int size() {
        return amountElements;
    }

    public void remove(int index) throws IllegalIndexOutOfBoundsException {
        try {
            for (int i = index; i <= amountElements; i++) {
                values[i] = values[i + 1];
            }
            amountElements--;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalIndexOutOfBoundsException("Невалідний індекс: " + index);
        }
    }
    public void clear() {
        values = new Object[8];
        amountElements = 0;
    }
}
