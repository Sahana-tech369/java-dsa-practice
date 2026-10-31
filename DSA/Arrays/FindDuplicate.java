import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                System.out.println("Duplicate = " + arr[i]);
                break;
            }

            set.add(arr[i]);
        }
    }
}