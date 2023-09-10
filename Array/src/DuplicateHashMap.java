
import java.util.HashMap;
import java.util.Map;

public class DuplicateHashMap {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 1, 2, 4, 5, 1, 6, 2, 2, 5, 6, 1, 5};

        // Create a HashMap to store the count of each element
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        System.out.println("Duplicate values in the array:");

        // Iterate through the inputArray and populate the elementCountMap
        for (int element : inputArray) {
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                elementCountMap.put(element, 1);
            }
        }

        // Iterate through the elementCountMap and print duplicates
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
