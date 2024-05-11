import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(i -> (double)quality[i] / wage[i]));

        for (int i = 0; i < n; i++) {
            pq.offer(i);
        }
        double res = 0.0;
        double minRatio = Integer.MAX_VALUE;
        while (k != 0) {
            int ind = pq.poll();
            if((double)quality[ind] / wage[ind] < minRatio ) {

            }
            k--;
        }
        return res;
    }
}