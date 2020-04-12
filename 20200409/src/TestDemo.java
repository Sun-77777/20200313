public class TestDemo {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "el";
        System.out.println(str1.contains(str2));

        //通过indexOf方法不光能判定子串是否存在，还可以查看子串所在的位置
        //返回值表示str2 在str 这个字符串中所载的下标位置
        //如果存在多组子串，返回的是最左侧子串的下标。
        System.out.println(str1.indexOf(str2));

        //从右往左找匹配的子串
        System.out.println(str1.lastIndexOf(str2));

        System.out.println(str1.startsWith("he"));
        System.out.println(str1.endsWith("lo"));
    }
}
