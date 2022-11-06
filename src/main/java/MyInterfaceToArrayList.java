public interface MyInterfaceToArrayList<E> extends Iterable<E> {
    void add(Object value); //adds an element to the end
    void remove(int index); //removes element at index
    void clear(); //clears the collection
    int size(); //returns the size of the collection
    Object get(int index); //returns the element at index
}
