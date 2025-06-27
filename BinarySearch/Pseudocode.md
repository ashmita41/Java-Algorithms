# Binary Search – Pseudocode

**Input**: A sorted array and a target element  
**Output**: Index of the target element (or -1 if not found)

### Pseudocode

1. Initialize `start = 0` and `end = array.length - 1`
2. While `start <= end`:
    - Calculate `mid = start + (end - start) / 2`
    - If `array[mid] == target`: return `mid`
    - If `target < array[mid]`: set `end = mid - 1`
    - Else: set `start = mid + 1`
3. Return -1 if element not found
