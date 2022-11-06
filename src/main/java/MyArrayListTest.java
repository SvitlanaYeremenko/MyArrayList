import java.util.Arrays;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<String> myStrings = new MyArrayList<>();
        myStrings.add("First");
        myStrings.add("Second");
        myStrings.add("Third");
        myStrings.add("Fourth");
        System.out.println("My array list = " + myStrings);

        myStrings.add("Fifth");
        myStrings.add("Sixth");
        System.out.println("My array list after adding 5 and 6 = " + myStrings);

        System.out.println("My array list size = " + myStrings.size());

        System.out.println("Element with index 1 = " + myStrings.get(1));

        myStrings.remove(3);
        System.out.println("My array list after remove element with index 3 = " + myStrings);
        myStrings.remove(0);
        System.out.println("My array list after remove element with index 0 = " + myStrings);

        System.out.println("My array list size = " + myStrings.size());

        System.out.println("Element with index 1 = " + myStrings.get(1));

        myStrings.clear();
        System.out.println("My array list after clear = " + myStrings);

    }
}
