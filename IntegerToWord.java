public class IntegerToWord {
    public static void main(String[] args) {
        int n=321;
        int temp=n;
        int rem=0;
        int len=0;
       
        while(n!=0)
        {
            rem=n%10;
            switch (rem) {
                case 1:
                    System.out.print("One"+" ");
                    break;
                    case 2:
                    System.out.print("Two"+" ");
                    break;
                    case 3:
                    System.out.print("Three"+" ");
                    break;
                    case 4:
                    System.out.print("Four"+" ");
                    break;
                    case 5:
                    System.out.print("Five"+" ");
                    break;
                    case 6:
                    System.out.print("Six"+" ");
                    break;
                    case 7:
                    System.out.print("Seven"+" ");
                    break;
                    case 8:
                    System.out.print("Eight"+" ");
                    break;
                    case 9:
                    System.out.print("Nine"+" ");
                    break;
            
                default:
                System.out.print("Two"+" ");
                break;
            }
            n=n/10;
        }
    }
}
//0 1 2 3 4--->index
//1 2 3 4 5--->element
//mazhya screen ch keyboard kam nhi kart ahe
