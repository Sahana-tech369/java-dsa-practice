class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

class Main {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.right = new Node(40);

        int key = 40;
        while (root != null && root.data != key) {
            if (key < root.data)
                root = root.left;
            else
                root = root.right;
        }

        System.out.println(root != null ? "Found" : "Not Found");
    }
}
