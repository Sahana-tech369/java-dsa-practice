import java.util.*;

class Main {
    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 3};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
