class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Main {

    static int findMax(Node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int left = findMax(root.left);
        int right = findMax(root.right);

        return Math.max(root.data, Math.max(left, right));
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        System.out.println("Maximum value: " + findMax(root));
    }
}
