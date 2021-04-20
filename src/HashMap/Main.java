package HashMap;

public class Main {
    public static void main(String[] args) {
        MyHashMap <Integer, String> cars = new MyHashMap<>();
        cars.put(5, "Audi");
        cars.put(2, "Skoda");
        cars.put(1, "Mers");
        System.out.println("Val at 123 "+cars.get(5));
        System.out.println("Val at 234 "+cars.get(2));
        System.out.println("Val at 23 "+cars.get(1));
    }
}
