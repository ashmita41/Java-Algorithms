# Sliding Window – Pseudocode

**Problem**: Find the maximum sum of a subarray of size k.

### Pseudocode

1. Initialize:
   - windowSum = sum of first k elements
   - maxSum = windowSum

2. Loop from i = k to end of array:
   - Subtract element at (i - k) from windowSum
   - Add element at i to windowSum
   - Update maxSum if windowSum is greater

3. Return maxSum
