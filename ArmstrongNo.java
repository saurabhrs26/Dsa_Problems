class ArmstrongNo{
    public static void main(String[] args) {
        int n=153;
        int num=n;
        int rem=0;
        int arm=0;
        while(n!=0)
        {
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }
        if(num==arm)
        {
            System.out.println("true");
        }
        else
        System.out.println("false");
    }
}