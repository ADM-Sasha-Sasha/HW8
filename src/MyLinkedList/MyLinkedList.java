package MyLinkedList;

import MyArrayList.MyArrayList;

import java.util.Iterator;

public class MyLinkedList <E> implements Methods<E> {
    private Node <E> first;
    private Node <E> last;
    private int size = 0;

    public MyLinkedList() {
        last = new Node<E>(null, first, null);
        first = new Node<E>(null, null, last);
    }

    @Override
    public boolean add(E e) {

        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public E clear() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
