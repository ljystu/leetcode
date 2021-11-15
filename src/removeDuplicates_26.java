public class removeDuplicates_26 {
    public int removeDuplicates(int[] nums) {
        //
        int slow = 1, fast = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
