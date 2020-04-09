import java.lang.reflect.Field;

public class TestDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = "hehe";
        //首先获取String 对象的图纸 （进一步了解String 里面的细节）
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        //根据图纸找到str里面的value数组
        char[] value = (char[])field.get(str);

        //然后再修改这个数组内容即可
        value[0] = 'a';
        System.out.println(str);
    }
    public static void main3(String[] args) {
        String str1 = "hehe";
        //inter 主动入池
        //inter可以主动去池子中查找 看看当前池中有没有str,
        // 如果池中不存在，就把这个string加入到池中
        //如果已经存在，就可以舍弃当前对象，直接获得池中的对应对象的引用。
        String str2 = new String("hehe").intern();
        System.out.println(str1 == str2);
    }
    public static void main2(String[] args) {
        String str1 = null;
        //System.out.println(str1.equals("hehe"));
        System.out.println("hehe".equals(str1));//更推荐使用这种写法，上面那种可能会报异常！
    }
    public static void main1(String[] args) {
        String str1 = "hehe";
        String str2 = new String("hehe");
        //对于引用类型来说，==比较的是对象的身份（对比两个引用中保存的地址是否一样）
        System.out.println(str1 == str2);
        //要想比较内容（值），需要使用equals方法.
        System.out.println(str1.equals(str2));
    }
}
