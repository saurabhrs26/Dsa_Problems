import java.util.Arrays;

class MissingNoInJava{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int A=2;
        int B=5;
        Arrays.sort(arr);
        int i=0;
        int sum=0;
        int start=2;
        while(start<=5)
        {
            sum=sum+start;
            start++;
        }
        int count=0;
        while(arr[i]<=B)
        {
            if(arr[i]==A)
            {
                count++;
            }
        }
        System.out.println("sum="+sum);

    }
}