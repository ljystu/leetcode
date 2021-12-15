import java.util.HashSet;

public class containsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i]==nums[i+1])
//                return true;
//        }
//        return false;
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
