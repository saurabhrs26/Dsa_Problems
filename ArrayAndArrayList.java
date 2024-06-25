import java.util.ArrayList;

public class ArrayAndArrayList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }
       for(int i=0;i<al.size();i++)
       {
        System.out.println( al.get(i));
       }
    }
}
