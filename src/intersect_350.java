import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class intersect_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        //没必要用两个hashmap 重来
//        List<Integer> result = new ArrayList<>();
//        HashMap<Integer, Integer> map1 = new HashMap<>();
//        HashMap<Integer, Integer> map2 = new HashMap<>();
//        for (int num : nums1)
//            if (map1.containsKey(num))
//                map1.put(num, map1.get(num) + 1);
//            else
//                map1.put(num, 1);
//        for (int num : nums2)
//            if (map2.containsKey(num))
//                map2.put(num, map2.get(num) + 1);
//            else
//                map2.put(num, 1);
//
//        for (int i: map1.keySet()){
//            if(map2.containsKey(i)){
//                for (int j = 0; j < Math.min(map1.get(i),map2.get(i)); j++) {
//                    result.add(i);
//                }
//            }
//
//        }
//        return  result.stream().mapToInt(Integer::intValue).toArray();
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int num : nums1) {
            if (map1.containsKey(num)) {
                map1.put(num, map1.get(num) + 1);
            } else {
                map1.put(num, 1);
            }
        }
        for (int num : nums2) {
            if (map1.containsKey(num) && map1.get(num) != 0) {
                result.add(num);
                map1.put(num, map1.get(num) - 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
