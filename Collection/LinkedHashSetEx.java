package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(43);
        set.add(1);
        set.add(4);
        set.add(36);
        System.out.println(set);
    }
}
