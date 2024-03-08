import java.util.Scanner;

public class pallindromeNo {
    public static void main(String[] args) {
        System.out.print("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        int rem=0;
        int originalNum=num;
        int palNo=0;
        while(num!=0)
        {
            rem=num%10;
            palNo=palNo*10+rem;
            num/=10;
        }
        if(originalNum==palNo)
        {
            System.out.println("The entered number is a Palindrome number.");
        }
        else{
            System.out.println("The entered number is not a Palindrome number.");
        }
}
}
