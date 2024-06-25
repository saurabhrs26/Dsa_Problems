package String;

public class Chapter1 {
    //Accessing character by index

    public char ReturnCharacterByIndex(String str,int n)
    {
        char ch=str.charAt(n);
        return ch;
    }
    public static void main(String[] args) {
      Chapter1 str=new Chapter1();
      System.out.println(str.ReturnCharacterByIndex("Saurabh", 4));
    }
}
