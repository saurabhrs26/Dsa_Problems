import java.util.Scanner;
public class SmallestElement
 { 
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
         int min=arr[0];
         for(int i=0;i<arr.length;i++)
         {
            if(min>arr[i])
            {
                min=arr[i];
            }
         }
         System.out.println("The smallest element is:"+min);  
    }
}
/*
 arr[5]={3,1,4,12,5}
 min=arr[0] //first element min=3   1.3<1 min=1   1<4

 for(i=1;i<5;i++)
 {
    if(min<arr[i])
    {
        min=arr[i];
    }
 }
 */