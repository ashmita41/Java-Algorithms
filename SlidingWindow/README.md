# Sliding Window Technique

**Category**: Arrays / Optimization  
**Type**: Time & Space Efficient Pattern

### What is Sliding Window?

The Sliding Window technique is a useful method for solving problems involving **arrays or strings**, especially when you're working with **contiguous subarrays** or **fixed-size windows**.

Instead of using nested loops (which take O(n²) time), we use a dynamic window to keep track of the necessary elements and **slide** the window across the array for an efficient O(n) solution.

---

### Where It's Used

- Maximum sum of subarray of size k
- Longest substring with unique characters
- Minimum window substring
- Maximum number of vowels in a substring
- Many more...

---

### Why Use Sliding Window?

- Reduces time complexity from O(n²) to O(n) in many cases
- Saves unnecessary re-computation
- Easy to implement and understand once the pattern is clear
