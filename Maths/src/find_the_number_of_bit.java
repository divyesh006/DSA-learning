public class find_the_number_of_bit {
    static int numberOfSetBit(int n){
        int count = 0;
        while (n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(numberOfSetBit(n));
    }
}
