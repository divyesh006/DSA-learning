import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n - 1 time
        for (int i = 0; i < arr.length; i++){
            // this is for if any value of i if below loop will not execute then that means array is sorted, and we not need to compare any more
            swapped = false;
            //the compression start from index 1
            for (int j = 1; j < arr.length - i; j++){
                //if the previous value is greater than current value then this loop will start and swapping value
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    //this value set true for this loop is executed
                    swapped = true;
                }
            }
            //if j loop will not execute that means swapped value is false and that's means array is sorted and this loop will break...
            if (!swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int [] a = {1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}