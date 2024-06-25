package Collection;
import java.util.ArrayDeque;
class ArrayDequeEx{
    public static void main(String[] args) {
        ArrayDeque<Integer> adq= new ArrayDeque<>();
        adq.offer(2);
        adq.offer(4);
       // System.out.println(adq); result:[2,4]
        adq.offerFirst(3);
        System.out.println(adq);//output:[3,2,4]
        adq.offerLast(7);
        System.out.println(adq);//output:[3,2,4,7]
        System.out.println("Peek():"+adq.peek());//gives first element from first
        System.out.println("peekFirst():"+adq.peekFirst());//gives first element from first. Works same as peek()
        System.out.println("peekLast():"+adq.peekLast());//gives first element from last. Works same as peek()
        adq.poll();
        System.out.println("poll():"+adq);//removes element from first
        System.out.println("pollFirst():"+adq.pollFirst());//removes element from first. Works same as poll()
        System.out.println("pollLast():"+adq.pollLast());//removes element from last
        adq.clear();
        System.out.println(adq);

    }
}
