package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(2);
        set.add(34);
        set.add(22);
        set.add(12);
        set.add(null);
        System.out.println(set);
    }
    
}
