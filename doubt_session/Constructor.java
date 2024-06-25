public class Constructor {
     Constructor()
    {
       System.out.println("this is default constructor");
    }
    Constructor(int a,int b)
    {
       int num1=a;
       int num2=b;
       System.out.println(num1+num2);
    }
   public static void main(String[] args) {
    
    Constructor c=new Constructor();
    Constructor d=new Constructor(11,22);

   }

}
