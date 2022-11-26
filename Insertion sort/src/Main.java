import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Element of Array:");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorting Array:");
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}