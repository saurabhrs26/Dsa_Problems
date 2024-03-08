public class SwapNo {
    public static void main(String[] args) {
        int a=20;
        int b=23;
        System.out.println("Value of a before swapping:"+a);
        System.out.println("Value of b before swapping:"+b);
        //using third variable;
        // int temp=a;
        //  a=b;
        //  b=temp;

        //  System.out.println("Value of a after swapping:"+a);
        //  System.out.println("Value of b after swapping:"+b);
        
        
        //without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Value of a after swapping:"+a);
        System.out.println("Value of b after swapping:"+b);
    }
}
