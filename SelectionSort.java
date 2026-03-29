public class SelectionSort {
    public static void main(String[] args) {
        
        int[] arr = {3,5,-1,6,70,12,33,12,-5};

        for(int i=0 ; i < arr.length - 1 ; i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j=i ; j<arr.length ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
                arr[i] = arr[mindx];
                arr[mindx] = temp;
        }
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }

    }
    
}
