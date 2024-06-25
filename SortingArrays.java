public class SortingArrays {
    public static void main(String[] args) {
        int arr[]={1,4,2,3,-1};
        for(int j=0;j<arr.length-1;j++)
        {
            for(int i=0;i<arr.length-1;i++)
            {
                int temp=0;
                if(arr[i]>arr[i+1])
                {
                 temp=arr[i];
                 arr[i]=arr[i+1];
                 arr[i+1]=temp;
                }
            }
        }
       
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
