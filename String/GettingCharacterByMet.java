package String;

public class GettingCharacterByMet {
   char GetChar(String str,int pos)
   {
    return str.charAt(pos);
   } 
   char GetCharByCharArray(String str,int pos)
{
  //type 1
//   char[] ch=str.toCharArray();
//   return ch[pos];
return str.toCharArray()[pos];
}
   public static void main(String[] args) {
    GettingCharacterByMet ob=new GettingCharacterByMet();
    System.out.println(ob.GetChar("Saurabh", 6));
    System.out.println(ob.GetCharByCharArray("Saurabh", 3));
   }
}
