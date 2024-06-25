package String;

public class ReplacingCharByStringBuffer {
    String ReplaceChar(String str,int pos,char chr)
    {
        System.out.println("Old String:"+str);
        StringBuffer sb=new StringBuffer(str);
        sb.setCharAt(pos,chr);
        return sb.toString();
    }

    public static void main(String[] args)
    {
     ReplacingCharByStringBuffer obj=new ReplacingCharByStringBuffer();
     String sb=obj.ReplaceChar("Saurabj",6, 'h');
     System.out.println("New String:"+sb);  
     String name=sb.toString(); 
    
    }
}
