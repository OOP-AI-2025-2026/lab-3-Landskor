package task3;
import java.util.EmptyStackException;

public class IntStack {
    private static final int DEFAULT_CAPACITY = 10;
    private int[] elements;
    private int size;
    public IntStack() {
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }
    public void push(int value) {
        ensureCapacity();
        elements[size++] = value;
    }
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[--size];
    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements[size - 1];
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void clear() {
        size = 0;
    }
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            int[] newElements = new int[newCapacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}