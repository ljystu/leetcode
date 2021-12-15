import java.util.Arrays;
import java.util.PriorityQueue;

public class scheduleCourse_630 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.scheduleCourse(new int[][]
                {{5, 15}, {3, 19}, {6, 7}, {2, 10}, {5, 16}, {8, 14}, {10, 11}, {2, 19}});
    }

    static class Solution {
        public int scheduleCourse(int[][] courses) {
            Arrays.sort(courses, (a, b) -> a[1] - b[1]);

            PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
            // 优先队列中所有课程的总时间
            int total = 0;

            for (int[] course : courses) {
                int ti = course[0], di = course[1];
                if (total + ti <= di) {
                    total += ti;
                    q.offer(ti);
                } else if (!q.isEmpty() && q.peek() > ti) {
                    total -= q.poll() - ti;
                    q.offer(ti);
                }
            }

            return q.size();
        }
    }
}
