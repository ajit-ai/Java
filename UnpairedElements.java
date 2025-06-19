import java.util.HashMap;
import java.util.Map;

public class UnpairedElements {
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};  // Example input
        System.out.println(findUnpairedElement(A));
    }

    public static int findUnpairedElement(int[] A) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Find the element with odd occurrence
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }

        // If no unpaired element is found (though not possible as per problem statement)
        return -1;
    }
}
