import java.util.*;

public class list {

    public void test() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(1, map.get(1) + 1);
        System.out.println(map);
    }

    public static void main(String[] args) {
//        list list = new list();
//        String result ;
//        System.out.println(result);
////        for(int item:result)
////            System.out.println(item);

    }
}

