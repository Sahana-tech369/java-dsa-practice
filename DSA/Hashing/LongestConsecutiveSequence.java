import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        // Put all elements into HashSet
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int longest = 0;

        // Check every number
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            // Start only if num - 1 does not exist
            if (!set.contains(num - 1)) {

                int count = 1;

                // Check consecutive numbers
                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest consecutive sequence = " + longest);
    }
}
