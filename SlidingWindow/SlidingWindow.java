/*
 * SLIDING WINDOW TECHNIQUE
 *
 * Example Problem: Find the maximum sum of any subarray of size k
 *
 * Description:
 * This approach avoids recomputing the sum of overlapping subarrays.
 * Instead of using nested loops, we calculate the sum once, and "slide" the window by adding the new element
 * and removing the element that is no longer in the window.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SlidingWindow {

    public static int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            System.out.println("Invalid input: k is greater than array length");
            return -1;
        }

        // Compute sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
