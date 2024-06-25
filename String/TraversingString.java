package String;



public class TraversingString {
    public void Traverse(String str)
    {
       
       
        for(int i=0;i<str.length();i++)
        {
          System.out.print(str.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        TraversingString ob=new TraversingString();
        ob.Traverse("Saurabh");

    }
}
