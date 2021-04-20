package MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> car = new MyQueue<String>();
        for (String string : Arrays.asList("Audi", "Mercedes", "BMW")) {
            car.add (string);
        }

    }
}
