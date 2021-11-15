public class maxSubArray_53 {
    public int maxSubArray(int[] nums) {
//        int[]dp =new int[nums.length];
        int sum=nums[0];
        int pre=0;
//        dp[0]=nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre=Math.max(nums[i],nums[i]+pre);
            sum=Math.max(pre,sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        maxSubArray_53 maxSubArray_53 =new maxSubArray_53();
        System.out.println(maxSubArray_53.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
