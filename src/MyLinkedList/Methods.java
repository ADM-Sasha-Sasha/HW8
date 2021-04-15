package MyLinkedList;

import java.util.Iterator;

public interface Methods <E> extends Iterable<E> {
    boolean add(E e);
    void remove(int index);
    E clear();
    int size();
    E get(int index);
    Iterator<E> iterator();
}