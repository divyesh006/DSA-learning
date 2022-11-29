public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        //in string, it can't modify the string value each time it will create a new object string are not mutable
        //but, in string buffer it can modify it will create one object and modify into their object
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.reverse());
        System.out.println(builder.deleteCharAt(0));
    }
}