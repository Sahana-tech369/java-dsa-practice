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
        Node temp = root;

        while (temp != null && temp.data != key) {
            if (key < temp.data)
                temp = temp.left;
            else
                temp = temp.right;
        }

        System.out.println(temp != null ? "Found" : "Not Found");
    }
}
