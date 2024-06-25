import java.util.Arrays;

public class FascinatingNo {
    public static void main(String[] args) {
        // long n=192;
        // long num1=n*2;
        // long num2=n*3;
        
        // String ans=n+""+num1+num2;
        // boolean isFasc=false;
        // for(int i=0;i<ans.length();i++)
        // {
        //     if(ans.charAt(i)=='1' || ans.charAt(i)=='2' || ans.charAt(i)=='3'
        //     || ans.charAt(i)=='5'|| ans.charAt(i)=='4'|| ans.charAt(i)=='6'|| ans.charAt(i)=='7'
        //     || ans.charAt(i)=='8'|| ans.charAt(i)=='9')
        //     {
        //         isFasc=true;
        //     }
            
        // }
        
        // System.out.println(ans);

        int num=192;
        int num1=num*2;
        int num2=num*3;
        String result=num+""+num1+num2;
        char[] ch=result.toCharArray();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
        String res=new String(ch);
        System.out.println(res);
        if(res.equals("123456789"))
        {
            System.out.println("Fascinating..");
        }
        else
        {
            System.out.println("No fascinating");
        }
    }
}
