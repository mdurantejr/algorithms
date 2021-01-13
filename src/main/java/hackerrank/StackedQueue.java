package hackerrank;

import java.util.Stack;

public class StackedQueue {

    private Stack<Character> s1 = new Stack<Character>();
    private Stack<Character> s2 = new Stack<Character>();

    public static void main(String[] args) {
        char[] charr = {'f','r','a','b','c'};
        StackedQueue stackedQueue = new StackedQueue();
        stackedQueue.enqueue(charr);
        char ret = 1;
        do {
            ret = stackedQueue.dequeue();
            System.out.println(ret);
        } while (ret != 0);
        stackedQueue.enqueue(charr);
        ret = stackedQueue.dequeue();
        System.out.println(ret);
    }

    private void enqueue(char[] charr) {
        for (char ch : charr) {
            s1.push(ch);
        }
    }

    private char dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return 0;
        }
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

}
