import java.util.HashMap;

public class longestSubsequence_1218 {
    //动态规划 使用数组超时给i，因而使用hashmap
    public int longestSubsequence(int[] arr, int difference) {
        int max = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - difference)) {
                max = Math.max(map.get(arr[i] - difference) + 1, max);
                map.put(arr[i], map.get(arr[i] - difference) + 1);
            } else
                map.put(arr[i], 1);

//            for (int j = 0; j < i; j++) {
//                if (arr[j] + difference == arr[i])
//                    dp[i] = 1 + dp[j];
//            }
        }
        return max;
    }
}
