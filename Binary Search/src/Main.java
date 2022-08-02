import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //this function wil find the element and return it
    //if it is not found in array it will return -1
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            // int mid = (start + end)/2  ==> this (start + end) may exceed the range of int value
            int mid = start + (end - start) / 2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }
        }
        //ans not found
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        //array must be sorted
        for (int i =  0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,target));
    }
}