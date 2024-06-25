public class StringReverse {
    public static void main(String[] args) {
        String name="Saurabh";
        String rev="";
        for(int i=0;i<name.length();i++)
        {
            rev=name.charAt(i)+rev;
        }
        System.out.println("Reverse:"+rev);
    }
}
/*
  name=abc
  rev=
  rev=a

  rev=b+a=ba
  rev=c+ba
  rev=cba
  

 */