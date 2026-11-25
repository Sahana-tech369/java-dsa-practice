import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {4, 4, 5, 5, 5, 2, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        Integer[] keys = map.keySet().toArray(new Integer[0]);

        for (int i = 0; i < keys.length; i++) {
            pq.add(keys[i]);
        }

        for (int i = 0; i < k; i++) {
            System.out.println(pq.poll());
        }
    }
}
