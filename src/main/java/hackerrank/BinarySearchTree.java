package hackerrank;

public class BinarySearchTree {

    static class Node {
        public Node(int data) {
            this.data = data;
        }
        int data;
        Node left;
        Node right;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        n2.left = n1;
        n2.right = n3;

        n6.left = n5;
        n6.right = n7;

        n4.left = n2;
        n4.right = n6;

        System.out.println(checkBst(n4));
    }

    private static boolean checkBst(Node n4) {
        return isBst(n4, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBst(Node n, int min, int max) {
        if (null == n) {
            return true;
        }
        if (min >= n.data || n.data >= max) {
            return false;
        }
        return isBst(n.left, min, n.data) && isBst(n.right, n.data, max);
    }

}
