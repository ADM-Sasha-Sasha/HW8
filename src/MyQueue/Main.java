package MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> car = new MyQueue<String>();
        car.add ("Audi");
        car.add ("Mercedes");
        car.add ("BMW");
        System.out.println(car);
    }
}
