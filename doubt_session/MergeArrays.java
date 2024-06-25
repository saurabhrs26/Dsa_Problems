class MergeArrays{
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3=new int[arr1.length+arr2.length];
        int index=0;
        for(int i=0;i<arr1.length;i++)
        {
            arr3[index++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr3[index++]=arr2[i];
        }
        System.out.println("Merged array:");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        }
}