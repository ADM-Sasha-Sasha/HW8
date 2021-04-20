package MyStack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyStack <T> implements sList <T>{
    private int size;
    private int[] sArray;
    private int top;

    public MyStack(int max) {
        this.size = max;
        sArray = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public void push(int value) {
        if (isFull()) {
            throw new NoSuchElementException("Stack is Full");
        }
        sArray[++top] = value;
        size++;
    }

    @Override
    public int remove(int index) {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return sArray[top--];
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++)
            sArray[i] = 0;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int peek() {
        return sArray[top];
    }

    @Override
    public int poll() {
        return remove(top);
    }

    @Override
    public String toString() {
        return "MyStack" + Arrays.toString(sArray);
    }
}
