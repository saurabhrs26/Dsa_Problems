package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<String,Integer>map=new LinkedHashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        for(Map.Entry<String,Integer>e:map.entrySet())
        {
            System.out.println("Key:"+e.getKey()+" Value:"+e.getValue());
        }
    }
}
