package Collection;
import java.util.*;
import java.util.LinkedList;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(4);
        qu.offer(6);
        //System.out.println(qu);
        qu.add(8);
        System.out.println(qu.peek());
        System.out.println("Removed element:"+qu.poll());
        System.out.println(qu);
        qu.poll();
        qu.poll();
        System.out.println(qu);
         System.out.println(qu.peek());
    }
}
