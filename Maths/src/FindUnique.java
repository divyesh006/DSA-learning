public class FindUnique {
    static int ans(int[] arr){
        int unique = 0;
        for (int n : arr){
            unique = unique ^ n;
        }
        return unique;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 3, 2, 1, 5, 6, 4, 5};
        System.out.println(ans(arr));
    }
}
