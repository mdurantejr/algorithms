import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class RunningMedian {

    private static Comparator<Integer> c1 = (i, j) -> i < j ? 1 : (j > 1 ? -1 : 0);
    private static Comparator<Integer> c2 = (i, j) -> i < j ? -1 : (j > 1 ? 1 : 0);

    private static Queue<Integer> minQ = new PriorityQueue<>(c1);
    private static Queue<Integer> maxQ = new PriorityQueue<>(c2);

    public static void main(String[] args) {
        int n = 6;
        int[] a = {12, 4, 5, 3, 8, 7};
        for (int i = 0; i < n; i++) {
            System.out.println(median(a[i]));
        }
    }

    private static double median(int n) {
        if (minQ.isEmpty() && maxQ.isEmpty()) {
            minQ.add(n);
        } else {
            if (n > getMedian()) {
                maxQ.add(n);
            } else {
                minQ.add(n);
            }
        }
        organise();
        return getMedian();
    }

    private static void organise() {
        if (minQ.size() - maxQ.size() > 1) {
            maxQ.add(minQ.poll());
        } else if (maxQ.size() - minQ.size() > 1) {
            minQ.add(maxQ.poll());
        }
    }

    private static double getMedian() {
        if (minQ.size() > maxQ.size()) {
            return (double) minQ.peek();
        } else if (minQ.size() < maxQ.size()) {
            return (double) maxQ.peek();
        }
        return (double) (minQ.peek() + maxQ.peek()) / 2;
    }

}
