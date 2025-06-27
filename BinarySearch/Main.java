public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 15, 19, 23};
        int target = 15;

        int result = BinarySearch.search(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
