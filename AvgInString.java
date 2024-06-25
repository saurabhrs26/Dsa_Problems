public class AvgInString {
    public static void main(String[] args) {
        int[] arr={2,4,5,6};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        double avg=sum/arr.length;
        String ans=(sum+" "+avg);
        System.out.println("Sum and Avg:"+ans);
    }
}
