import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner s=new Scanner(System.in);
       // s.close();
        String name=s.nextLine();
         // String name="racecar";
        String original=name;
        char[] reverse=new char[name.length()];
        int j=0;
        for(int i=name.length()-1;i>=0;i--)
        {
            reverse[j]=original.charAt(i);
            j++;
        }
        String rev="";
       for(int i=0;i<reverse.length;i++)
       {
        rev=rev+reverse[i];
       }
       if(original.equalsIgnoreCase(rev))
       {
        System.out.println("Given string "+original+" is pallindrome");
       }
       else{
        System.out.println("Given string "+original+" and "+rev+" are different");
       }
    }
}
