public class SumofDigit {
    //923 ---->9+2+3=14
    public static void main(String[] args) {
        int num=123;
        int rem=0;
        int sum=0;
        while(num!=0)
        {
          rem=num%10;//rem=0 123%10=
          sum=sum+rem;
          num=num/10;
        }
        System.out.println("sum of digit="+sum);
    }
  
}
