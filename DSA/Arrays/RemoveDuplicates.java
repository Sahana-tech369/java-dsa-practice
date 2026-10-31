import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}