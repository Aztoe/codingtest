import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class Node {
        private int num;
        private Node left , right;

        public Node(int num) {
            this.num = num;
        }
        public Node(Node left, Node right) {
            this.left = left;
            this.right = right;
        }

        void insert(int input) {

            if(this.num> input) {
                if (this.left == null) {
                    this.left = new Node(input);
                } else {
                    this.left.insert(input);
                }
            } else if (this.num< input) {
                if(this.right == null) {
                    this.right = new Node(input);
                } else {
                    this.right.insert(input);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Node root = new Node(Integer.parseInt(br.readLine()));

        while (true) {
            String read = br.readLine();
            if (read == null || read.equals("")) break;

            int input = Integer.parseInt(read);
            root.insert(input);
        }

        post(root);
    }

    private static void post(Node node) {

        if(node.left != null ) post(node.left);
        if(node.right != null) post(node.right);
        System.out.println(node.num);
    }
}