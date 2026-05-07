import java.util.ArrayList;
import java.util.List;

public class Read {
    public static void main(String[] args) {

        // Read: Problem 1
        List<Integer> myAges = new ArrayList<>();
        // Creates an empty ArrayList that can only store Integer values.

        // Read: Problem 2
        Integer x = 22;
        // Creates an Integer object named x and stores the value 22.

        System.out.println(x);
        // Prints the value of x.

        // Output:
        // 22

        // Read: Problem 3
        myAges.add(x);
        // Adds the Integer value stored in x, which is 22, to myAges.

        myAges.add(Integer.valueOf(25));
        // Converts 25 into an Integer object and adds it to myAges.

        myAges.add(27);
        // Adds 27 to myAges. Java autoboxes the int into an Integer.

        // myAges now contains: [22, 25, 27]

        // Read: Problem 4
        int a = myAges.get(2);
        // Gets the value at index 2 from myAges and stores it in int variable a.
        // Index 2 is the third item, which is 27.

        System.out.println(a);
        // Prints the value of a.

        // Output:
        // 27

        // Read: Problem 5
        Holder<String> myHolder = new Holder<>("Portland");
        // Creates a Holder object that stores a String value, "Portland".

        System.out.println(myHolder);
        // Prints the myHolder object.
        // Exact output depends on the Holder class's toString() method.

    }
}
