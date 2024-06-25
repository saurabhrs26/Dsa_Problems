package String;

public class SwappingCharUsingStrBuffer {
    String SwapChar(String str)
    {
        if(str=="" || str==null)
        {
            return str;
        }
        else
        {
            StringBuffer sb=new StringBuffer(str.length());
            for(int i=0;i<str.length()-1;i+=2)
            {
              sb=sb.append(str.charAt(i+1));
              sb=sb.append(str.charAt(i));
            }
            str.to

            if(str.length()%2!=0)
            {
                sb=sb.append(str.charAt(str.length()-1));
            }
            return sb.toString();

        } 
    }
    public static void main(String[] args) {
        SwappingCharUsingStrBuffer ob=new SwappingCharUsingStrBuffer();
        System.out.println("for Diksha:"+ob.SwapChar("Diksha"));
        System.out.println("for Saurabh:"+ob.SwapChar("Saurabh"));
    }
}
