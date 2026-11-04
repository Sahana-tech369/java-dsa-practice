class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Main {

    static int sumNodes(Node root) {

        if (root == null) {
            return 0;
        }

        return root.data + sumNodes(root.left) + sumNodes(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Sum of nodes: " + sumNodes(root));
    }
}
