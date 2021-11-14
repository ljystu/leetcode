public class missingNumber {
    public int missingNumber(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]!=i)
//                return i;
//        }
//        return nums.length;
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i] ^ i;
        }
        return xor;
    }
}
