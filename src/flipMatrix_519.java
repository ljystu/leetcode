import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class flipMatrix_519 {
    class Solution {
        Random rand = new Random();
        int m, n;
        int size;
        Map<Integer, Integer> map = new HashMap<>();

        public Solution(int m, int n) {
            this.m = m;
            this.n = n;
            reset();
        }

        public int[] flip() {
            int x = rand.nextInt(size--);
            int y = map.getOrDefault(x, x);
            map.put(x, map.getOrDefault(size, size));
            return new int[]{y / n, y % n};
        }

        public void reset() {
            size = m * n;
            map.clear();
        }
    }
}
