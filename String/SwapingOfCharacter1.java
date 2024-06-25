package String;
public class SwapingOfCharacter1 {
    String ReplaceChar(String str)
    {
        if(str.length()==0 || str==null)
        {
            return str;
        }
        else
        { char[] ch=str.toCharArray();
            for(int i=0;i<ch.length-1;i+=2)
            {
                char temp=ch[i];//store the first element in temp
                ch[i]=ch[i+1];//store the 2nd element in first element position
                ch[i+1]=temp;// store the value of temp i.e first value at the location of 2nd element position
            }
            // String result="";
            // for(int i=0;i<ch.length;i++)
            // {
            //     result=result+ch[i];
            // }
            // return result;
            return new String(ch);
        }
       
    }

    public static void main(String[] args) {
        SwapingOfCharacter1 ob=new SwapingOfCharacter1();
        System.out.println("For Sakshi:"+ob.ReplaceChar("Sakshi"));
        System.out.println("For Saurabh:"+ob.ReplaceChar("Saurabh"));
}
}
