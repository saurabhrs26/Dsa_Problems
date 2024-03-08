import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        sc.close();
        System.out.println("Original string : "+name);
        char[] reverseName=new char[name.length()];
        int j=0;
        int length = name.length();
        for(int i=length-1;i>=0;i--)
        {
           reverseName[j]=name.charAt(i);
           j++;
        }
        System.out.print("Reverse String:");
        for(int i=0;i<length;i++)
        {
              System.out.print(reverseName[i]);
        }
    }
}
