public class sumOfNo {
    public static void main(String[] args) {
        // int num=124;// 2,25,345,1298----->0,2,34,129
        // //1+2+4=7
        // //5=1*2*3*4*5
        // //230=1*2*3...*230
        // int sum=0;
        // int rem=0;
        // //1...2...4...
        // // %
        // while(num>0)//1) 124 2) 12 3)1
        // {
        //     rem=num%10;  //1. rem=4 2.rem=2  3.rem=1
        //     sum=sum+rem;//1. 0+4  2)sum=4....sum+rem....4+2=6
        //     num=num/10;//.......1.124/10=12    2) 12/10=1 3)1/10=0
           
           
        // }
        // System.out.println("Value of sum="+sum);

        // 121 202 343
        int num=3;
        int count=0;
        int i=2;
        while(i<num)
        {
          if(num%i==0)
          {
            count++;
          }
          i++;
        }
       if(count>0)
       {
        System.out.println("NUmber is not prime");
       }
       else{
        System.out.println("NUmber is  prime");
       }
    }
}
