import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to calculate factorial:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt() ;
        sc.close();
        int fact=1;
        int i=1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("The factorial of "+num+" is :"+fact);

    }
}
