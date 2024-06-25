public class PrimeNoArray {
  void PrimeArray(int[] arr)
  {
    for (int i =0;i<arr.length;i++) 
    {
    boolean isPrime = true;
    for (int j = 2; j <arr[i]; j++) 
    {
        if (arr[i] % j == 0) {
            isPrime = false;
            break;
    }
    }
    if (isPrime && arr[i] > 1)
     {
        System.out.print(arr[i] + " ");
     }
    }
}

    public static void main(String[] args) {
        PrimeNoArray ob=new PrimeNoArray();
        int arr[]={3,23,4,234,543,3,46};
        ob.PrimeArray(arr);
        }
    }

