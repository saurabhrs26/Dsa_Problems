package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public interface PriorityQueueEx {
   public static void main(String[] args) {
    //PriorityQueue <Integer> pq=new PriorityQueue<>();
    Queue<Integer>pq=new PriorityQueue<>();
    pq.offer(54);
    pq.offer(9);
    pq.offer(18);
    pq.offer(27);
    pq.poll();
    System.out.println("After Removing: "+pq);
    
    System.out.println("Peek element:"+pq.peek());
    pq.poll();
    System.out.println("Peek element:"+pq.peek());
    Queue<Integer>pq1=new PriorityQueue<>(Comparator.reverseOrder());
    pq1.add(20);
    pq1.add(10);
    pq1.add(30);
   
    System.out.println("Max Heap:"+pq1);
   }
}
