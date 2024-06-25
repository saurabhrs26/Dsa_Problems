public class DisplayPos {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int num=3;// user kahi pn value deu shkte
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                System.out.println("Location:"+ ++i);
            }
        }
    }
}
// 0 1 2 3 4 5--->index
// 1 2 3 4 5 6---->element
/*
 * arr[0]=1
 * arr[1]=2
 * arr[2]=3
 * arr[3]=4
 * arr[4]=5
 * arr[5]=6
 * 
 * 
 */
