public class TestString {
    public static void main(String[] args) {
        //需要进行转义 （两个\\,一个是java中进行转义，一个是正则中表示转义）
        // | + * 这几个也需要进行这样的转义
        String string = "192+168+1+0";
        String[] result = string.split("\\+");
        for (String x : result) {
            System.out.println(x);
        }

        String s = "name=zhangsan&age=1&sex=male";
        String[] result1 = s.split("&");
        for (int i = 0; i < result.length; i++) {
            String[] tmp = result[i].split("=");
            for (String x : tmp) {
                System.out.println(x);
            }
        }

        String string1 = "hello world";
        //[beg,end)
        System.out.println(string1.substring(4));


    }
}
