import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "aabbcdde";

        HashMap<Character, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find first character with frequency 1
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (freq.get(ch) == 1) {
                System.out.println("First non-repeating = " + ch);
                break;
            }
        }
    }
}