import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
         System.out.println("Enter the size of an Array:");
         Scanner sc=new Scanner(System.in);
         int size=sc.nextInt();
         int arr[]=new int[size];
         System.out.println("Enter the elements:");
         for(int i=0;i<arr.length;i++)
         {
            arr[i]=sc.nextInt(); 
         }
         int sum=0;
         for(int i=0;i<arr.length;i++)
         {
            sum=sum+arr[i];
         }
         System.out.println("Sum:"+sum);
    }
}
/*
arr1={1,2,3}
arr2={4,5,6}
arr={1,2,3,4,5,6}//6
int arr=new int[arr1.size+arr2.size]
index=0
for(int i=0;i<arr1.length;i++)
{
    arr[index++]=arr1[i]
}
//index=4
for(int i=0;i<arr1.length;i++)
{
    arr[index++]=arr2[i]
}
a[0]
a[1]
a[2]

 */