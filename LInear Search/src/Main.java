import java.util.Scanner;

public class Main {
    //search in the array : return the index if item found
    //otherwise it item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++){
            //check for a element at every index
            if (arr[i] == target){
                return i;
            }
        }
        //this line will execute if none of the return statement above executed
        //hence the target not found
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
        System.out.println(linearSearch(arr,target));
    }
}