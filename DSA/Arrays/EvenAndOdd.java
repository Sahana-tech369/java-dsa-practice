public class EvenAndOdd {
    public static void main(String[] args) {

        int[] arr = {10, 5, 8, 7, 12, 3};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
    }
} 