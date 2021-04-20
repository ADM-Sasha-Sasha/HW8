package HashMap;
public interface hList <K,V> {
    void put(K key, V value);
    Object remove(Object key, Object value);
    void clear();
    int size();
    V get(K key);
}
