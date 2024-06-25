package String;
class ReplacingCharacter{
    String replaceChar(String str,char chr,int pos)
    {
        System.out.println("Old String:"+str);
        str=str.substring(0,pos)+chr+str.substring(pos+1);
        return str;
    }
public static void main(String[] args) {
    ReplacingCharacter obj=new ReplacingCharacter();
   String name=obj.replaceChar("Saurabj", 'h', 6);
   System.out.println("New String:"+name);
   
}
}