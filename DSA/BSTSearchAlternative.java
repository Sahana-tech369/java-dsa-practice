class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Main {

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    static boolean search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        return key < root.data
                ? search(root.left, key)
                : search(root.right, key);
    }

    public static void main(String[] args) {

        Node root = null;
        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        for (int x : arr) {
            root = insert(root, x);
        }

        System.out.println(search(root, 40));
    }
}
