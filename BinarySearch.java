import java.util.Arrays;

public class BinarySearch {

    public static void printArrray(int[] arr){
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,40,-6,12,532,743,-5,0,1};
        int target = 12;

        int n = arr.length;
        int left = 0 , right = n-1;

        System.out.println("Array befor sorting: ");
        printArrray(arr);

        Arrays.sort(arr);

        System.out.println("Array after sorting: ");
        printArrray(arr);

        System.out.println();
        System.out.print("The target element is on the index: ");
        while(left<=right){
            int mid = (left + right)/2;

            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] < target) left = mid + 1; 
            else right = mid -1;

        }
        
    }
    
}
