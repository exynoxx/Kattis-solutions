import java.util.HashMap;
import java.util.Scanner;

public class ceiling {
    static class BinarySearchTree {

        /* Class containing left and right child of current node and key value*/
        class Node {
            int key;
            Node left, right;

            public Node(int item) {
                key = item;
                left = right = null;
            }
        }

        // Root of BST
        public Node root = null;

        // Constructor
        BinarySearchTree() {
            root = null;
        }

        String hash (Node root) {
            String ret = "";
            if (root.left == null) {
                ret += "0";
            } else {
                ret += "1" + hash(root.left);
            }

            if (root.right == null) {
                ret += "0";
            } else {
                ret += "2" + hash(root.right);
            }
            return ret;
        }

        void insert(int key) {
            root = insertRec(root, key);
        }

        Node insertRec(Node root, int key) {

            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.key)
                root.left = insertRec(root.left, key);
            else if (key > root.key)
                root.right = insertRec(root.right, key);

            return root;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] line = in.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int c = 0;

        BinarySearchTree bst = new BinarySearchTree();
        HashMap<String,Boolean> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            line = in.nextLine().split(" ");
            for (int j = 0; j < k; j++) {
                bst.insert(Integer.parseInt(line[j]));
            }

            String hashvalue = bst.hash(bst.root);

            if (hm.get(hashvalue) == null) {
                c++;
                hm.put(hashvalue,true);
            }
            bst.root = null;

        }
        System.out.println(c);
    }
}
