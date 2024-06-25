public class EvenOddArr {
    int[] Even(int[] a)
    {   
        for(int i=0;i<a.length;i++)
        {
           System.out.println(a[i]);
        }
       return a;
    }
    public static void main(String[] args) {
        EvenOddArr ob=new EvenOddArr();
        int [] arr={1,2,3,4,5,6};
        ob.Even(arr);
    }
}
