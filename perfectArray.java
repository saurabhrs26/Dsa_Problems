class perfectArray{
    public static void main(String[] args) {
   int[] arr={1,2,3,2,1};
   int n=arr.length;
   int[] ar=new int[n];
       
   int j=0;
   for(int i=n-1;i>=0;i--)
   {
       ar[j]=arr[i];
       j++;
   }
   for(int i=0;i<ar.length;i++)
   {
    System.out.print(ar[i]+" ");
   }
//    if(arr.equals(ar))
//    {
//        System.out.println("true");
//    }
//    else
//    {
//     System.out.println("false");
//    }


    }
}