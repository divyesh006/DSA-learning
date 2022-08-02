import java.util.Scanner;

public class OrderAgnosticBS {
    //this function will return the index if element found
    //otherwise it will return -1
    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //this boolean variable for check to order ascending or descending
        //in ascending order starting value is less than ending value
        // in descending order ending value is less than starting value
        boolean isAsc = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start) / 2;
            //for both order this return value method same
            if (arr[mid] == target){
                //ans found
                return mid;
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }else {
                if (target < arr[mid]){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        //ans not found
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(orderAgnostic(arr,target));
    }
}
