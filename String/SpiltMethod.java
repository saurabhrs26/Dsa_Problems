package String;

public class SpiltMethod {
    public void StringSpilt(String str)
    {
        String s[]=str.split(" ");
        for(String itr:s)
        {
           System.out.println(itr+" ");
        }
    }
    public static void main(String[] args) {
        // String str="Saurabh,Sakharkar";
        // String name[]=str.split(",");
        // for (String ch : name) {
        //     System.out.print(ch+" ");
        // }
        SpiltMethod obj = new SpiltMethod();
        obj.StringSpilt("Hello World!");
    }
}
