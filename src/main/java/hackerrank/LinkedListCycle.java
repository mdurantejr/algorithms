package hackerrank;

public class LinkedListCycle {

    static class Node {
        int data;
        Node next;
    }

    private static boolean hasCycle(Node node) {
        if (null == node) {
            return false;
        }

        Node fast, slow;
        slow = fast = node;
        while (true) {
            slow = slow.next;
            if (null != fast.next) {
                fast = fast.next.next;
            } else {
                return false;
            }
            if (null == slow || null == fast) {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Node n = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        n.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n;

        System.out.print(hasCycle(n));
    }
}
