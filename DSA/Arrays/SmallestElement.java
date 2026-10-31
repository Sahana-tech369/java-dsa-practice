public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 2, 20};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element = " + smallest);
    }
}