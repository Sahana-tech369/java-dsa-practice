class CircularQueue {
    int[] arr = new int[5];
    int front = 0;
    int rear = -1;
    int size = 0;

    // Enqueue: add an element
    void enqueue(int value) {
        if (size == arr.length) {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
    }

    // Dequeue: remove the front element
    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Removed: " + arr[front]);
        front = (front + 1) % arr.length;
        size--;
    }

    // Display the queue
    void display() {
        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % arr.length;
            System.out.print(arr[index] + " ");
        }

        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();

        q.enqueue(60);

        q.display();
    }
}
