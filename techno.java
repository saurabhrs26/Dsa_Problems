package Arrays.Task;

import java.util.Scanner;

public class techno {
    public static void main(String[] args) {
        int num,firsthalf,secondhalf,sum,count=0;
       System.out.println("ENter the number:");
       Scanner sc=new Scanner(System.in);
       num=sc.nextInt();
       int n=num;
       while(num!=0)
       {
        
        num=num/10;
        count++;

       }
       if(count%2==0)
       {
           firsthalf=n/(int) Math.pow(10,(count/2));
           secondhalf=n%(int) Math.pow(10,(count/2));
           
       
       sum=firsthalf+secondhalf;
       
       int sq=(int)Math.pow(sum, 2);
       if(sq==n){
       System.out.println("number is tech number");
       }
       else{
        System.out.println("Number is not tech number");
       }
       
       }
       else{
        System.out.println("Number is not tech number");
       }
        }
       
        
       

        
   
       
    }



  //2025
  //9801