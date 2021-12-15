import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class findRelativeRanks_506 {
    public String[] findRelativeRanks(int[] score) {
//        PriorityQueue<int[]> score_list=new PriorityQueue<>((a,b)->b[1]-a[1]);
//        for (int i = 0; i < score.length; i++) {
//            score_list.add(new int []{i,score[i]});
//        }

        int[][] score_list = new int[score.length][2];
        for (int i = 0; i < score.length; i++) {
            score_list[i][0] = i;
            score_list[i][1] = score[i];
        }
        Arrays.sort(score_list, (int[] a, int[] b) -> b[1] - a[1]);
        String[] result = new String[score.length];
        int pos;
        for (
                int i = 0;
                i < score.length; i++) {
//            pos = score_list.poll()[0];
            pos = score_list[i][0];
            if (i == 0) {
                result[pos] = "Gold Medal";
            } else if (i == 1) {
                result[pos] = "Silver Medal";
            } else if (i == 2) {
                result[pos] = "Bronze Medal";
            } else {
                result[pos] = i + 1 + "";
            }
        }
        return result;
    }
}
