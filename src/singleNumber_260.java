import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class singleNumber_260 {
    public int[] singleNumber(int[] nums) {
//        List<Integer> res=new LinkedList<>();
//        Arrays.sort(nums);
//        int i=0;
//        while(i<nums.length-1){
//            if(nums[i]==nums[i+1])
//                i+=2;
//            else{
//                res.add(nums[i]);
//                i++;
//                if(res.size()==2)
//                    break;
//            }
//        }
//        if(i==nums.length)
//            res.add(nums[i]);
//        return   res.stream().mapToInt(Integer::intValue).toArray();
        int xorsum = 0;

        for (int i = 0; i < nums.length; i++) {
            xorsum ^= nums[i];
        }
        //防止超限
        int lsb = (xorsum == Integer.MIN_VALUE ? xorsum : xorsum & (-xorsum));
        int type1 = 0, type2 = 0;
        for (int num : nums) {
            if ((num & lsb) != 0) {
                type1 ^= num;
            } else {
                type2 ^= num;
            }
        }
        return new int[]{type1,type2};

    }
}
