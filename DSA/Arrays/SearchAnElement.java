public class SearchAnElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int search = 30;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
