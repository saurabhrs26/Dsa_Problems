package Arrays.Task;

import java.util.Scanner;

public class fascinatingNo {
    public static void main(String[] args) {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //lets assume no is already in three digit
        int temp=num;
        int prod1=temp*2;
        int prod2=temp*3;
        System.out.println("original no:"+num+" multiply by 2:"+prod1+" multiply by 3:"+prod2);
        String fullNo=num+""+prod1+prod2;
        System.out.println("Complete no:"+fullNo);
        int i,count=0;
        for(char c='1';c<='9';c++)
        {
             boolean found=false;
          for(i=0;i<fullNo.length();i++)
          {
           
             if(fullNo.charAt(i)==c)
             {
               found=true;
                break;
             }
            //  
          }
          if(!found){
                
                count++;
                break;
             }
          
        }
        if(count>0)
          {
            System.out.println("is not fasc no");
          }
          else{
            System.out.println(num+" is Fascinating number");
          }

        sc.close();
    }
}
