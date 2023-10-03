
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
                System.out.println(entry.getKey() +" "+ entry.getValue());
            }
        }
    }
}

/*
  The provided code is written in a programming language that supports an enhanced for loop (such as Java) and it aims to count the occurrences of each element in an 
  array named `inputArray`. Let's break down the code step by step:

1. **Enhanced for Loop (`for (int element : inputArray) { ... }`)**:
   This type of loop is used to iterate through each element in the `inputArray`. For each iteration, the current element from `inputArray` is assigned to the variable 
   `element`, and the loop body is executed.

2. **Conditional Check (`if (elementCountMap.containsKey(element)) { ... } else { ... }`)**:
   Within each iteration of the loop, the code checks if the `element` is already a key in the `elementCountMap`, which presumably is a map where the keys are the 
   elements from `inputArray`, and the values are their respective counts.

3. **Counting Element Occurrences in the Map**:
   - If `element` is already a key in the map (`elementCountMap`), it retrieves its current count using `elementCountMap.get(element)`. It then increments this count 
     by 1 and updates the count for that element in the map using `elementCountMap.put(element, elementCountMap.get(element) + 1)`.
   - If `element` is not a key in the map, it adds the element as a new key with an initial count of 1 using `elementCountMap.put(element, 1)`.

 In summary, this code iterates through each element in `inputArray`, updating a map (`elementCountMap`) to keep track of how many times each element appears in the array.
 If an element has been encountered before, it increments its count by 1; otherwise, it adds the element to the map with a count of 1. The end result is a map that 
 contains the count of each unique element in the input array. 
 */
