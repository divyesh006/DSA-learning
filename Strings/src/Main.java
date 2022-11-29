public class Main {
    public static void main(String[] args) {
        //this will create a one object and pointing to same object
        //and this strings are immutable
        String a = "Divyesh";
        String b = "Divyesh";
        System.out.println(a == b);
        //this will create new Object of their variable
        //so it will give false because it is different object
        String c = new String("Divyesh");
        String d = new String("Divyesh");
        System.out.println(c == d);
        //this will give true because it will check only for the value not for objects
        System.out.println(c.equals(d));
        //this is for the find a character at specific index
        System.out.println(c.charAt(0));
        //this convert a character into ascii value and that value
        System.out.println('a' + 'b');
        //this is string and this will print "ab"
        System.out.println("a" + "b");
        //this will print character first it will convert a into ascii value and that after that ascii value
        //convert into corresponding character basically that mean typecasting
        System.out.println((char)('a' + 3));
        String series = "";
        //string not allowed us to modify the string value, so it will create a object after each loop and copy
        //from the previous loop and add character to the string
        //so basically after one loop it will create a new object for new string
        for (int i = 0; i < 26; i++){
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
        //one is string and another one is character so it will add both
        System.out.println("a" + 'b');
    }
}