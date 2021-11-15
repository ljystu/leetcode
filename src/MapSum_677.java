import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;

class MapSum_677 {

    HashMap<String,Integer> map;
    public MapSum_677() {
        map=new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key,val);
    }

    public int sum(String prefix) {
        int val=0;
        for(String key:map.keySet()){
            if(key.startsWith(prefix))
                val+=map.get(key);
        }
        return val;
    }

}