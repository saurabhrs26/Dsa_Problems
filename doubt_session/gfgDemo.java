public class gfgDemo {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3};
        int len1=arr1.length;
        int len2=arr2.length;
        int i=0,j=0,ans=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]!=arr2[j])
            {
              ans=i;
              break;
            }
       i++;
       j++;
    }
    System.out.println(ans);
}
}
