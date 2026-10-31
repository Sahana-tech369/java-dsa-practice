import java.util.*;

public class FrequencyCount {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            System.out.println(num + " = " + map.get(num));
        }
    }
}
