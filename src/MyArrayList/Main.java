package MyArrayList;

public class Main {
    public static void main(String[] args) {
        Methods<String> strings = new MyArrayList<String>();
        strings.add("first");
        strings.add("second");
        strings.add("tree");
        strings.remove(1);

        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println(strings.add(""));
        System.out.println(strings.clear());
        System.out.println(strings.size());
        System.out.println(strings.get(1));
    }
}
