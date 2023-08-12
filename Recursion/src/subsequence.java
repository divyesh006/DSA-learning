import java.util.ArrayList;

public class subsequence {
    static ArrayList<String> subSeqA(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqA(p + ch, up.substring(1));
        ArrayList<String> right = subSeqA(p , up.substring(1));

        left.addAll(right);
        return left;
    }
    static void subSeq(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1));
        subSeq(p, up.substring(1));
    }
    public static void main(String[] args) {
        System.out.println( subSeqA(" ", "abc"));
    }
}
