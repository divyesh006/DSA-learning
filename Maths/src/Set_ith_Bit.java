public class Set_ith_Bit {
    static int setBit(int n, int position){
        return n | (1 << (position - 1));
    }
    public static void main(String[] args) {
        System.out.println(setBit(6, 1));
    }
}
