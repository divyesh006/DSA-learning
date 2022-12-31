public class Reset_ith_Bit {
    static int resetBit(int n, int position){
        return n & (~(1 << (position - 1)));
    }
    public static void main(String[] args) {
        System.out.println(resetBit(5,1));
    }
}
