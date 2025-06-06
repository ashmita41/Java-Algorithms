# Huffman Coding – Pseudocode

### Step 1: Frequency Count
For each character in the input string:
- Count its frequency using a hashmap.

### Step 2: Min-Heap Construction
- Create a priority queue (min-heap) of nodes.
- Each node contains:
  - character
  - frequency
  - left and right child

### Step 3: Build Huffman Tree
While the heap has more than one node:
- Remove two nodes with the lowest frequency.
- Create a new node with combined frequency.
- Make the two removed nodes its left and right children.
- Add the new node back into the heap.

### Step 4: Generate Codes
- Traverse the tree from the root.
- Assign:
  - ‘0’ for going left
  - ‘1’ for going right
- Store codes in a map (char → binary string).

### Step 5: Encode String
For each character in the input string:
- Replace it with its binary code from the map.

### Step 6: Decode String
- Read the binary-encoded string bit by bit.
- Match against the reverse map (code → character).
- Reconstruct the original string.
