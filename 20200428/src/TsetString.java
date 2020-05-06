public class TsetString {
    public static void main(String[] args) {

        String str1 = "heLLo";
        String str2 = "HELLO";

        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder是可变对象，append拼接字符串的时候修改对象本身。
        stringBuilder.append("hello");
        stringBuilder.append("x");
        //如何让一个字符串首字母大写，其他字母小写
        //先处理首字母
        String ret = str1.substring(0,1).toUpperCase() + str1.substring(1).toLowerCase();
        System.out.println(ret);

    }
}
