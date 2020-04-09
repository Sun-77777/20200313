import java.lang.reflect.Field;

public class Teeee {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //用反射来改变字符串的值
        String str = "hehehe";
        //获取string类中的value字段 这个value和String 源码中的value是匹配的
        Field field = String.class.getDeclaredField("value");
        //将这个字段的访问属性设为true
        field.setAccessible(true);
        //把str中的value属性获取到
        char[] value = (char[])field.get(str);
        value[0] = 'b';
        System.out.println(str);
    }
}
