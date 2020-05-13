public class TestString {
    public static boolean isNumber(String str) {
        for (int i = 0;i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String string = "abc";
        System.out.println(isNumber(string));
        String str = "hello";
        //获取到这个字符串中的某个字符
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        char[] chars = {'a','b','c'};
        String str1 = new String(chars);
        System.out.println(str1);
    }
}
