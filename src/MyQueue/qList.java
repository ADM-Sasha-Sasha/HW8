package MyQueue;

public interface qList<T> {
    void add(Object value);
    Object remove(int index);
    void clear();
    int size();
    T peek();
    int poll();

    String toString();
    //Iterator<E> iterator();
}
