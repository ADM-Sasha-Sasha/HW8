package MyLinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.add(40);
        list.clear();
        list.get(1);
        list.size();
        list.remove(2);

        System.out.println((list));
    }
}
