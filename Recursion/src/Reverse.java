public class Reverse {
    static int sum = 0;
    static void reverse1(int n){
        if (n == 0){
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }
    public static void main(String[] args) {
        reverse1(3456);
        System.out.println(sum);
    }
}
