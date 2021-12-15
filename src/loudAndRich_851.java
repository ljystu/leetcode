import java.util.*;

public class loudAndRich_851 {
    static class Solution {
        public int[] loudAndRich(int[][] richer, int[] quiet) {
            int n = quiet.length;
            List<Integer>[] g = new List[n];
            for (int i = 0; i < n; ++i) {
                g[i] = new ArrayList<Integer>();
            }
            //连接已知节点
            int[] inDeg = new int[n];
            for (int[] r : richer) {
                g[r[0]].add(r[1]);
                ++inDeg[r[1]];
            }
            //初始化
           int[] ans = new int[n];
            for (int i = 0; i < n; ++i) {
                ans[i] = i;
            }
            Queue<Integer> q = new ArrayDeque<Integer>();
            for (int i = 0; i < n; ++i) {
                if (inDeg[i] == 0) {
                    q.offer(i);
                }
            }
            while (!q.isEmpty()) {
                int x = q.poll();
                for (int y : g[x]) {
                    if (quiet[ans[x]] < quiet[ans[y]]) {
                        ans[y] = ans[x]; // 更新 x 的邻居的答案
                    }
                    if (--inDeg[y] == 0) {
                        q.offer(y);
                    }
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.loudAndRich(new int[][]{{1,2}}, new int[]{0,1,2}));
    }
}
