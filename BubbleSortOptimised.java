public class BubbleSortOptimised {
    public static void main(String[] args) {
        int[] arr = {3,5,-1,6,70,12,33,12,-5};

        for(int i=0 ; i < arr.length - 1 ; i++)
        {
            int swap = 0;
            for(int j=0 ; j<arr.length -1 - i ; j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap ==0) break;
        }

        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
    }    
}
