package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("One", 1);
        map.put("two",2);
        map.put("Three",3);
        map.put("four",4);
        for(Map.Entry<String,Integer>e:map.entrySet())
        {
            System.out.println("Key and value:"+e);
            System.out.println("Key:"+e.getKey());
            System.out.println("Value:"+e.getValue());
        }
    }
}
