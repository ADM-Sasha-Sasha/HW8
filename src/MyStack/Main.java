package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack <Integer> stack = new MyStack<Integer>(25);
        stack.push(99);
        stack.push(254);
        stack.push(135);
        stack.push(666);
        System.out.println(stack);
    }
}
