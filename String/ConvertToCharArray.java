package String;

public class ConvertToCharArray {
    void ConvertToChrArr(String str)
    {
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
    public static void main(String[] args) {
        ConvertToCharArray ob=new ConvertToCharArray();
        ob.ConvertToChrArr("Saurabh is my name");
    }
}
