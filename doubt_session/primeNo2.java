public class primeNo2 {
    public static void main(String[] args) {
        int num=31;//it is not a prime number
        int i=2;
        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                break;
            }
        }
        if(i==num)
        {
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }

    }
}
