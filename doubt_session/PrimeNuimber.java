//take a number from user and check it is  prime or not

import java.util.Scanner;

public class PrimeNuimber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }

        if(count>0)
        {
            System.out.println("Number is not prime");
        }
        else{
            System.out.println("number is prime");
        }
    }
}
