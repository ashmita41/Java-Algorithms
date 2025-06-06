import java.util.*;

class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost; // frequency
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        HashMap<Character, Integer> fmap = new HashMap<>();

        // Step 1: Frequency map
        for (int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            fmap.put(cc, fmap.getOrDefault(cc, 0) + 1);
        }

        // Step 2: Min-Heap of nodes
        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : fmap.entrySet()) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.add(node);
        }

        // Step 3: Build Huffman Tree
        while (minHeap.size() > 1) {
            Node first = minHeap.poll();
            Node second = minHeap.poll();
            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;
            minHeap.add(newNode);
        }

        // Root of the tree
        Node root = minHeap.poll();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        // Step 4: Fill encoder and decoder
        this.initEncoderDecoder(root, "");
    }

    private void initEncoderDecoder(Node node, String osf) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }

        initEncoderDecoder(node.left, osf + "0");
        initEncoderDecoder(node.right, osf + "1");
    }

    // Step 5: Encode a string
    public String encode(String source) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            sb.append(encoder.get(source.charAt(i)));
        }
        return sb.toString();
    }

    // Step 6: Decode a string
    public String decode(String codedString) {
        StringBuilder ans = new StringBuilder();
        StringBuilder key = new StringBuilder();

        for (int i = 0; i < codedString.length(); i++) {
            key.append(codedString.charAt(i));
            if (decoder.containsKey(key.toString())) {
                ans.append(decoder.get(key.toString()));
                key.setLength(0); // reset the key
            }
        }
        return ans.toString();
    }
}