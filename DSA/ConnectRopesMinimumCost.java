import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        int cost = 0;

        while (pq.size() > 1) {

            int a = pq.poll();
            int b = pq.poll();

            int sum = a + b;

            cost = cost + sum;

            pq.add(sum);
        }

        System.out.println(cost);
    }
}
