public class singleNumber_136 {
    /**
     * 异或运算 136
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        int slow = 0, fast = 0;
//        while (fast < nums.length) {
//            if (nums.length == 1)
//                return nums[0];
//
//            if (nums[fast] != nums[slow]) {
//                if (fast == slow + 1) {
//                    return nums[slow];
//                } else {
//                    slow = fast;
//
//                }
//            }
//            if (slow == nums.length - 1)
//                return nums[nums.length - 1];
//            fast++;
//        }
//        return -1;

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;

    }

}
