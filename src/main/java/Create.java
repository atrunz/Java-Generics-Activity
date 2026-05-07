import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Create {
    public static void main(String[] args) {

        // Create: Problem 1
        // Create a List of Maps where:
        // Key = String
        // Value = Integer

        List<Map<String, Integer>> world = new ArrayList<>();


        // Create: Problem 2
        // Create the usa map and add city populations

        Map<String, Integer> usa = new LinkedHashMap<>();

        usa.put("New York City", 8600000);
        usa.put("Los Angeles", 4000000);
        usa.put("Chicago", 2700000);
        usa.put("Houston", 2400000);

        // Add usa map to world list
        world.add(usa);


        // Create: Problem 3
        // Create the canada map and add city populations

        Map<String, Integer> canada = new LinkedHashMap<>();

        canada.put("Toronto", 5400000);
        canada.put("Montreal", 3500000);
        canada.put("Vancouver", 2300000);
        canada.put("Calgary", 1200000);

        // Add canada map to world list
        world.add(canada);


        // Create: Problem 4
        // Retrieve the second key-value pair
        // from the first map (usa)

        List<String> usaKeys = new ArrayList<>(usa.keySet());

        String secondUsaKey = usaKeys.get(1);
        Integer secondUsaValue = usa.get(secondUsaKey);

        System.out.println(secondUsaKey + " -> " + secondUsaValue);


        // Create: Problem 5
        // Retrieve the first key-value pair
        // from the second map (canada)

        List<String> canadaKeys = new ArrayList<>(canada.keySet());

        String firstCanadaKey = canadaKeys.get(0);
        Integer firstCanadaValue = canada.get(firstCanadaKey);

        System.out.println(firstCanadaKey + " -> " + firstCanadaValue);

    }
}