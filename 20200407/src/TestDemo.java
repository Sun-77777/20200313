public class TestDemo {
    public static int compareto(String str1,String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        int min = Math.min(len1,len2);
        int i = 0;
        while (i < min) {
            if (str1.charAt(i) - str2.charAt(i) != 0) {
                return str1.charAt(i) - str2.charAt(i);
            }
            i++;
        }
        return len1-len2;
    }
    public static void main(String[] args) {
        //实现字符串的比较
        String str = "hahaev";
        String str1 = "hahatt";
        int ret = compareto(str,str1);
        System.out.println(ret);
    }
}
