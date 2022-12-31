public class Find_ith_Bit {
    static int findBit(int n, int position){
        return (n & (1 << (position - 1))) >> (position - 1);
    }
    public static void main(String[] args) {
        System.out.println(findBit(14,3));
    }
}
