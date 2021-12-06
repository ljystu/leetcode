import java.awt.font.NumericShaper;
import java.util.Arrays;

public class maxEnvelopes_354 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        int[] step = new int[envelopes.length];
        int res = 0;
        for (int i = 0; i < envelopes.length; i++) {
            step[i] = 1;
            for (int j = 0; j < i; j++) {
                if (envelopes[j][1] < envelopes[i][1]) {
                    step[i] = Math.max(step[i], step[j] + 1);
                }
            }
            res = Math.max(res, step[i]);
        }

        return res;
    }


    public static void main(String[] args) {
        maxEnvelopes_354 maxEnvelopes_354 = new maxEnvelopes_354();
        System.out.println(maxEnvelopes_354.maxEnvelopes(new int[][]{{2, 3}, {3, 4},{5,4}}));
    }
}
