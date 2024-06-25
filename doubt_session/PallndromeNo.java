public class PallndromeNo {
    public static void main(String[] args) {
       int num=128;//321    121--->121
       int temp=num;
       int rem=0;
       int rev=0;
       while(num!=0)
       {
        rem=num%10;//1...12%10=2  1%10=1
        rev=rev*10+rem;//0+1=1  //10+2=12  //120+1
        num=num/10;// 121/10=12  12/10=1  //1/10=0
       }
       //reverse
       System.out.println("reverrse no is:"+rev);

       //pallindrome
      if(rev==temp)
      {
        System.out.println("Number is pallindrome");
      }
      else{
        System.out.println("Number is not pallindrome");
      }
      int count=0;
      for(int i=2;i<temp;i++)
      {
        if(temp%i==0)
        {
          count++;
        }
      } 
      if(count>0)
      {
        System.out.println("It is not prime number");
      }
      else{
        System.out.println("It is a prime number");
      }
    }
}
//temp=num
/*
num=0
temp
1 no --->prime
1 num 2 3 4 5 -->not prime

 */