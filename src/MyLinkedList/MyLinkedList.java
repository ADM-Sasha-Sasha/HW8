package MyLinkedList;

public class MyLinkedList <T> implements List <T> {
    private static class Node <T> {
        T item;
        Node<T> next;
        Node<T> prev;
        private T[] values;

        public Node(T item) {
            this.item = null;
            this.next = null;
            this.prev = null;
            values = (T[]) new Object[0];
        }
    }
        private Node<T> first;
        private Node<T> last;
        private int size;

        public void MyLinkedList () {
            size = 0;
        }


    @Override
    public void add(Object value) {
        Node node = new Node(value);
        if (first == null) first = node;
        else {
            last.next = node;
            node.prev = last;
        }
        last = node;
        size++;
    }

    @Override
    public void remove(int index) {
        Node<T> node = getIndex(index);
        if (node.prev == null) first = node.next;
        else node.prev.next = node.next;
        if (node.next == null) last = node.prev;
        else node.next.prev = node.prev;
        size--;

    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return getIndex(index).item;
    }

    public Node <T> getIndex(int index) {
        if (index < 0 || index >= size) throw new
                IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        Node<T> result;
        if (size / 2 > index) {
            result = first;
            for (int i = 0; i < index; i++) result = result.next;
        } else {
            result = last;
            for (int i = size - 1; i > index; i--) result = result.prev;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iter<T> iterator = this.iterator();
        while(Iter.hasNext()){
            sb.append(iterator.next());
            if (Iter.hasNext()) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();

    }

    @Override
    public Iter<T> iterator() {
            return new Iter<T>();
    }
}
