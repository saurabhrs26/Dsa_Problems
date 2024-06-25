package String;

public class ReverseString1 {
    public static void main(String[] args) {
        String name="Saurabh";
        String rev="";
        char ch;
        for(int i=0;i<name.length();i++)
        {
            ch=name.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Original:"+name);
        System.out.println("Reverse:"+rev);
    }
}
