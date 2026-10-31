public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};

        int n = 5;

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        int total = n * (n + 1) / 2;

        int missing = total - sum;

        System.out.println("Missing number = " + missing);
    }
}