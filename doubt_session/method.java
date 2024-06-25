public class method {

    /*types of method
     * 1. no return type no args
     * 2. return type with no args
     * 3. no return type with args
     * 4. return type with args
     */
   
    // no return type no args
    public void add()
    {
        int a=3;
        int b=5;
        System.out.println("Addition:"+(a+b));

    }

    // return type with no args
    public int mul()
    {
        int x=23;
        int t=9;
        int prod=x*t;
        return prod;
    }
    //no return type with  args
    public void square(int n)
    {
        System.out.println(n*n);
    }
     // return type with  args
     public int GreaterNo(int a,int b)
     {
        if(a>b)
        {
            return a;
        }
        else{
            return b;
        }
     }
    public static void main(String[] args) {
       method m1=new method();
       m1.add();
       int x=m1.mul();
       System.out.println(x);
       m1.square(4);
      System.out.println("Greater number:"+m1.GreaterNo(4,6)); 

    }
}
