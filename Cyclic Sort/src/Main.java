import java.util.Arrays;
import java.util.Scanner;

public class Main {
 /*   static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; i++){
            while(i != arr[i] - 1){
                swap(arr,i,arr[i]-1);
            }
        }
    }*/
    static void cyclic(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
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
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element according to 1 to n form to sort");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        cyclic(arr);
        System.out.println("Sorting Array");
        System.out.println(Arrays.toString(arr));
    }
}