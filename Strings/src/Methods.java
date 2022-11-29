import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Divyesh Patel";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('y'));
        System.out.println("   Divyesh   p ".strip());
        System.out.println(name.strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
