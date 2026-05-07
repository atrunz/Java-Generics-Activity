import java.util.ArrayList;
import java.util.List;

public class Fix {
    public static void main(String[] args) {

        // Fix: Problem 1
        List<String> v = new ArrayList<>();

        v.add("test");

        // Bug: v is a List<String>, so v.get(0) returns a String.
        // The original code tried to cast "test" to Integer, which causes a ClassCastException.
        String i = v.get(0);


        // Fix: Problem 2
        List<Integer> myNumbers = new ArrayList<>();

        // Bug: myNumbers is a List<Integer>, but 3.14 is a double.
        // IDE error: no suitable method found for add(double)
        myNumbers.add(3);


        // Fix: Problem 3

        // Bug: holder1 is declared as Holder<Integer>, but "Indianapolis" is a String.
        // That creates a type mismatch because the Holder should contain an Integer.
        Holder<Integer> holder1 = new Holder<>(37);

        System.out.println(holder1);
        System.out.println(holder1.getValue());


        // Fix: Problem 4

        // Bug: Generics cannot use primitive types like int.
        // IDE error: Type argument cannot be of primitive type
        Holder<Integer> holder2 = new Holder<>(35);


        // Fix: Problem 5
        List<Double> myTemps = new ArrayList<>();

        myTemps.add(72.0);

        // Bug: myTemps.get(0) returns a Double, but the original code stored it in an int.
        // IDE error: incompatible types: Double cannot be converted to int
        double g = myTemps.get(0);
    }
}