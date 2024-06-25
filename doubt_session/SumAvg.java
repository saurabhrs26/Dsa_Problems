import java.util.Scanner;

public class SumAvg{
    int[] Arr(int n)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        return arr;
    }
    int Sum(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    int Avg(int a[])
    {
        int sum=Sum(a);
        int avg=0;
        avg=sum/a.length;
        return avg;
    }
    public static void main(String[] args)
    {
        SumAvg ob=new SumAvg();
        int arr[]=Arr();

        System.out.println("Sum:"+ob.Sum(arr));
        System.out.println("Average:"+ob.Avg(arr));
    }
}