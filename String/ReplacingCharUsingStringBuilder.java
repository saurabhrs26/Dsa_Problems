package String;

public class ReplacingCharUsingStringBuilder {
    StringBuilder repalceChar(String str,char chr,int pos)
    {
        System.out.println("Old Text:"+str);
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(pos, chr);
        return sb;
    }
    public static void main(String[] args) {
        ReplacingCharUsingStringBuilder rc=new ReplacingCharUsingStringBuilder();
       StringBuilder sb= rc.repalceChar("Saurabh Sakharkar", 'R', 7);
       System.out.println("New Text:"+sb);
    }
}
