public class TestDemo {
    public static void main(String[] args) {
        //字符变字符串
        char[] array = {'a','b','c'};
        String str = new String(array);
        System.out.println(str);

        //charAt 获取某个下标对应的字符
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("=================");

        //字符串变字符
        char[] array2 = str.toCharArray();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }
}
