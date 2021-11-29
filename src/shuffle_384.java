import java.util.*;

public class shuffle_384 {
    List<Integer> list=new ArrayList<>();
    int [] ori;

    public shuffle_384(int[] nums) {
        ori=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            ori[i]=nums[i];
        }
    }

    public int[] reset() {
        return ori;
    }

    public int[] shuffle() {
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();

    }

}
