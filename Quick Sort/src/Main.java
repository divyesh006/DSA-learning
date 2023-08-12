import java.util.Arrays;

public class Main {
    static void sort(int[] arr,int low, int high){
        if (low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while(start <= end){
            while (arr[start] < pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        sort(arr, low, end);
        sort(arr, start, high);
    }
    public static void main(String[] args) {
        int[] arr = {1, 12, 8, 4, 6, 5, 3, 7, 18, 20};
        sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}