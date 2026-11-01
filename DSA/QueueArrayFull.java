class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int rear = -1;

        int[] values = {10, 20, 30, 40};

        for (int value : values) {
            if (rear == arr.length - 1) {
                System.out.println("Queue is full!");
            } else {
                rear = (rear + 1) % arr.length;
                arr[rear] = value;
            }
        }

        System.out.println("Queue: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
