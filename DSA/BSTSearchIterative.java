class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Main {
    static boolean search(Node root, int key) {

        while (root != null) {
            if (root.data == key)
                return true;

            if (key < root.data)
                root = root.left;
            else
                root = root.right;
        }

        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.right = new Node(40);

        System.out.println(search(root, 40));
    }
}
