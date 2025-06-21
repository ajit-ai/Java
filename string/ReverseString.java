public class ReverseString {
    public static void main(String[] args) {
        String input = "performance";
        System.out.println("Original: " + input);

        // 1. Using char array (manual swap)
        System.out.println("1: " + reverseWithCharArray(input));

        // 2. Using StringBuilder reverse()
        System.out.println("2: " + new StringBuilder(input).reverse().toString());

        // 3. Using recursion
        System.out.println("3: " + reverseRecursively(input));

        // 4. Using character concatenation in a loop
        System.out.println("4: " + reverseWithConcat(input));

        // 5. Using Java 8 Streams
        System.out.println("5: " + reverseWithStreams(input));

        // 6. Using stack
        System.out.println("6: " + reverseWithStack(input));

        // 7. Using Collections.reverse()
        System.out.println("7: " + reverseWithCollections(input));

        // 8. Using StringBuffer reverse()
        System.out.println("8: " + new StringBuffer(input).reverse().toString());

        // 9. Using XOR swap in char array
        System.out.println("9: " + reverseWithXOR(input));

        // 10. Using substring
        System.out.println("10: " + reverseWithSubstring(input));
    }

    // 1. Char array manual swap
    static String reverseWithCharArray(String str) {
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    // 3. Recursion
    static String reverseRecursively(String str) {
        if (str.isEmpty())
            return str;
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    // 4. Character concatenation in a loop
    static String reverseWithConcat(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // 5. Java 8 Streams
    static String reverseWithStreams(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
    }

    // 6. Using stack
    static String reverseWithStack(String str) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.toString();
    }

    // 7. Using Collections.reverse()
    static String reverseWithCollections(String str) {
        java.util.List<Character> list = new java.util.ArrayList<>();
        for (char c : str.toCharArray()) list.add(c);
        java.util.Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);
        return sb.toString();
    }

    // 9. XOR swap in char array
    static String reverseWithXOR(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
            i++;
            j--;
        }
        return new String(arr);
    }

    // 10. Using substring
    static String reverseWithSubstring(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.substring(i, i + 1);
        }
        return result;
    }
}