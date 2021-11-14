public class rotate {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] rotation = new int[k];
        for (int i = nums.length - k, j = 0; i < nums.length; i++) {
            rotation[j++] = nums[i];
        }
        for (int i = nums.length - k - 1; i >= 0; i--) {
            nums[i + k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = rotation[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
