import java.util.HashMap;

public class twoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] twonum = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                twonum[0] = map.get(target - nums[i]);
                twonum[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return twonum;
    }
}
