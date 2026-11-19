class Main {
    public static void main(String[] args) {
        int[] a = {10, 25, 40, 30, 20};
        int max = 0, second = 0;

        for (int n : a) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }

        System.out.println(second);
    }
}
