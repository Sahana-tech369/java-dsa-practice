class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
    }
}

class Main {
    static boolean search(Node r, int key) {
        if (r == null) return false;
        if (r.data == key) return true;

        if (key < r.data)
            return search(r.left, key);
        return search(r.right, key);
    }

    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.right = new Node(40);

        System.out.println(search(root, 40));
    }
}
