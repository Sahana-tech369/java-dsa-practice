import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Enqueue
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q);

        // Peek
        System.out.println("Front element: " + q.peek());

        // Dequeue
        System.out.println("Removed: " + q.poll());

        System.out.println("Queue after dequeue: " + q);
    }
}
