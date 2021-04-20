package MyQueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue <T> implements qList <T> {

    private Object [] qArray;
    private int front;
    private int rear;
    private int size;
    private int capacity=5;

    public MyQueue () {
        qArray = new Object[capacity];
        size=0;
        front = -1;
        rear = -1;
    }
    public boolean isFull(){
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if (front == -1) {
            return true;
        }
        return false;
    }


    @Override
    public void add(Object value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            qArray[rear] = value;

        }
    }

    @Override
    public Object remove(int index) {
        Object element;
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        else {
            element =qArray[front];
        }
        if (front >= rear) {
            front = -1;
            rear = -1;
        }
        else {

            front++;
        }
        return (element);
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            qArray[i] = null;
        size = 0;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if (isEmpty()){
            return null;
        }
        return (T) qArray[front];
    }

    @Override
    public int poll() {
        if (isEmpty()) {
            return 0;
        }
        front=front-1;
        return front;
    }

    @Override
    public String toString() {
        return "qArray = " + Arrays.toString(qArray);
    }
}
