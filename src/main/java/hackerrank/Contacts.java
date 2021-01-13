package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Contacts {

    class Node {
        private Map<Character, Node> nodeMap = new HashMap<>();
        int count;

        public void add(char ch) {
            nodeMap.putIfAbsent(ch, new Node());
        }

        public Node get(char ch) {
            return nodeMap.get(ch);
        }

        public void incCount() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    class NodeHelper {
        private Node root = new Node();

        public void add(String name) {
            Node curr = root;
            for (char ch : name.toCharArray()) {
                curr.add(ch);
                curr = curr.get(ch);
                curr.incCount();
            }
        }

        public int find(String contact) {
            Node curr = root;
            for (char ch : contact.toCharArray()) {
                curr = curr.get(ch);
                if (null == curr) {
                    return 0;
                }
            }
            return curr.getCount();
        }
    }
}
