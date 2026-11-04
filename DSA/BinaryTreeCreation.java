class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

class Main {
    public static void main(String[] args) {

        // Create nodes
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Root: " + root.data);
        System.out.println("Left: " + root.left.data);
        System.out.println("Right: " + root.right.data);
        System.out.println("Left child of 20: " + root.left.left.data);
        System.out.println("Right child of 20: " + root.left.right.data);
    }
}
