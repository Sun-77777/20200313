import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "hehe";
        String res = s.replaceAll("heh","aa");
        System.out.println(s);
        System.out.println(res);

        String str = "aaa,bbb,ccc";
        String[] resu = str.split(",");
        System.out.println(Arrays.toString(resu));

        String str1 = "192.168.1.1";
        String[] resul = str1.split("\\.");
        System.out.println(Arrays.toString(resul));

        String string = "name=zhangsan&age=18";
        String[] re = string.split("&");
        for (String tmp:re) {
            System.out.println(tmp);
        }
    }
}
