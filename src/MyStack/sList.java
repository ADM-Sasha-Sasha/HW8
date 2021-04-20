package MyStack;

public interface sList<T> {
        void push(int value);

        int remove(int index);

        void clear();

        int size();

        int peek();

        int poll();

    String toString();
}

