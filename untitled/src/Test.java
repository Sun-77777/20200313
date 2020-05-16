import java.util.Scanner;

public class Test {
    public static String Typing (String s) {
        if (s == "<") {
            return null;
        }
        return s.substring(0,s.length()-2);
    }

    public static void main(String[] args) {
        String s = "abcd<";
        String ret = Typing(s);
        System.out.println(ret);
    }
}
