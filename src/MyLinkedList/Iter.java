package MyLinkedList;

class Iter <T> implements Iterable<T> {

    public static boolean hasNext() {
        return node != null;
    }

    public Iter<T> iterator() {
        return new Iter<T>() {
            private Node<T> node = first;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public T next() {
                T item = node.item;
                node = node.next;
                return item;
            }
        };
    }

    public java.lang.Object next() {
        return null;
    }
}