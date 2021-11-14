import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;

class MapSum {

    HashMap<String,Integer> map;
    public MapSum() {
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