package HashMap;

public class MyHashMap <K, V> implements hList <K, V> {
    public static class Node {
        private Object key;
        private Object value;
        private int hash;
        private Node next;

        public Node(Object value, Object key) {
            this.key = key;
            this.value = value;
            next = null;
            if (key != null)
                hash = key.hashCode();
        }
        public Object getValue {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public Object getKey() {
            return key;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void clearNext() {
            next = null;
        }

        public void setData(Object value) {
            this.value = value;
        }

    }
    private static int capacity = 15;
    Node[] node;

    public MyHashMap() {
        node = new Node[capacity];
        for (int i = 0; i < capacity; i++) {
            Node node = new Node(null, null);
            node[i] = node;
        }
    }

    public int countIndex(Object key) {
        int index = key.hashCode() & (node.length - 1);
        return index;
    }



    public boolean isEmpty() {
        for (int i = 0; i < node.length; i++) {
            if (node[i] == null) {
            } else {
                return false;
            }
        }
        return true;
    }



    @Override
    public void put(K key, V value) {

    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public Object remove(Object key, Object value) {
        return null;
    }
}
