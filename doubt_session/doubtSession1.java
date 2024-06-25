//Take the range from the user and and print the even odd number

import java.util.Scanner;
// start=1 end=11----> 1 2 3 45 6 7 8 9 10 11
public class doubtSession1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a start range:");
        int start=sc.nextInt();//1
        System.out.println("Enter a end range:");
        int end=sc.nextInt();//11
        //even number
        System.out.println("Even No are:");
        for(int i=start;i<end;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
       //odd number
    }
    
}
