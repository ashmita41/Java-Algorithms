/*
 * BINARY SEARCH ALGORITHM
 *
 * Description:
 * Binary Search is a classic algorithm used to find the position of a target value within a sorted array.
 * It eliminates half of the remaining elements in each step, making it highly efficient.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 *
 */

public class BinarySearch {

    // Returns the index of target, or -1 if not found
    public static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (target < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1; // target not found
    }
}
