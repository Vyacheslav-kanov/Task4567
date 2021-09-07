package Task6;

import java.util.*;

public class FlipperMap<K, V> {

    public Map revers(Map<K, V> map){
        Map<V, K> mapRev = new HashMap<>();
        for(Map.Entry<K, V> e: map.entrySet()){
            mapRev.put(e.getValue(), e.getKey());
        }
        return mapRev;
    }
}
