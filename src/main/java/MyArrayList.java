import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<E> implements MyInterfaceToArrayList<E> {

    private Object[] elements;
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.elements = new Object[capacity];
    }

    @Override
    public void add(Object value) {
        if (size == 0) {
            elements[0] = value;
        } else if (size < elements.length) {
            elements[size] = value;
        } else {
            elements = Arrays.copyOf(elements, (elements.length + elements.length / 2));
            elements[size + 1] = value;
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index >= 0 && index <= size) {
            Object[] elementsAfterRemoving = new Object[elements.length];
            System.arraycopy(elements, 0, elementsAfterRemoving, 0, index);
            if (elements.length - 1 - index >= 0)
                System.arraycopy(elements, index + 1, elementsAfterRemoving, index, elements.length - 1 - index);
            elements = elementsAfterRemoving;
            size --;
        }
    }

    @Override
    public void clear() {
        Arrays.fill(elements, null);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        if (index < size && index >= 0) {
            return elements[index];
        } else {
            return null;
        }
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public String toString() {

        Object[] elementsToString = new Object[size];
        for (int i = 0; i < size; i++) {
            if (elements[i] != null) {
                elementsToString[i] = elements[i];
            }
        }
        return Arrays.toString(elementsToString);
    }
}
