import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int x = 25;
        int k = 2;

        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) ->
                Integer.compare(Math.abs(b - x), Math.abs(a - x)));

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
