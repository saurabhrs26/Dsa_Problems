import java.util.Scanner;

class EvenOddArray{
    public void GetArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the element of array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
    Display(arr);
    EvenArray(arr);
      
    }
    int[] Display( int arr[])
    {
        System.out.println("Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        return arr;
    }
    int[] EvenArray(int[] arr)
    {
        System.out.println("Even No");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
       
        EvenOddArray ob=new EvenOddArray();
        ob.GetArray();

    }
}