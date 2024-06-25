package Collection;

import java.util.*;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        // List<Integer> al=new ArrayList<>();
        // al.add(1);
        // al.add(2);
      
        // al.add(1, 3);
       
        // ArrayList <Integer> al2=new ArrayList<>();
        // al2.add(4);
        // al2.add(5);
        // al.addAll(al2);
        // System.out.println(al);
        // System.out.println(al.get(4));
        // // al.remove(0);
        // // System.out.println("After removing at index 0:"+al);
        // al.remove(Integer.valueOf(5));
        // System.out.println("After removing element 5:"+al);
        // al.set(3,43);
        // System.out.println(al);
        // for(int i=0;i<al.size();i++)
        // {
        //     System.out.println("Element by For Loop:"+al.get(i));
        // }
        // for(Integer itr:al)
        // {
        //     System.out.println("Element by forEach:"+itr);
        // }
        // Iterator<Integer> itr=al.iterator();
        // while(itr.hasNext())
        // {
        //     System.out.println("Using iterator:"+itr.next());
        // }
        //  al.clear();
        //  System.out.println(al);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);


        
}
}
