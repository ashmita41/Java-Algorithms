# Huffman Coding

**Category**: Greedy Algorithms / Data Compression  
**Type**: Lossless Compression

### What is Huffman Coding?

Huffman Coding is a greedy algorithm used to compress data without losing any information. It assigns shorter binary codes to frequently occurring characters and longer codes to rare ones.

### How It Works

1. Count the frequency of each character.
2. Build a binary tree (Huffman Tree) using a min-heap.
3. Assign binary codes to each character based on its path in the tree (left = 0, right = 1).
4. Use the binary codes to encode the original string.
5. Decode the string using the reverse mapping from binary code to characters.

### Where It’s Used

- ZIP files
- GZIP compression
- JPEG and PNG image formats
- MP3 audio files

---

**Goal**: Reduce the overall file size while preserving exact data.  
**Compression Type**: Lossless  
