public class TestDemo {
    public static void main(String[] args) {
        //字符-> 字符串
        char[] chars = {'h','h','a','a'};
        String string = new String(chars);

        //字符串-> 字符
        char[] chars1 = string.toCharArray();
        for (int i = 0; i <chars1.length ; i++) {
            System.out.println(chars1[i]);
        }
        System.out.println("================");

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }
}
