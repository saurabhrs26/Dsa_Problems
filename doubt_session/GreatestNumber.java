class GreatestNumber{
    public static void main(String[] args) {
        int[] arr={1,2,32,4,3};
        int great=arr[0];//1
        
        for(int i=0;i<arr.length;i++)
        {
            if(great<arr[i])
            {
               great=arr[i];
            }
        }
        System.out.println("Greatest element:"+great);
    }
}
// great=1 2>1 great=2 3>2 great=3....