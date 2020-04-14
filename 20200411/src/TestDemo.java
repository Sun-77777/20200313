import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection是接口，add，remove，contains 这些方法都是抽象方法，
 * 这些方法在执行的时候，具体的行为取决于Collection对应的真实对象的类型
 * 调用add，remove..方法 发生了动态绑定 new的ArrayList 里也有add，remove..方法
 */
public class TestDemo {
    public static void main(String[] args) {
        //1.实例化一个Collection对象，Collection是一个接口，只能实例化实现Collection接口的类才可以
        Collection<String> collection = new ArrayList<>();
        //2.使用size/isEmpty
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        //3.使用add添加元素
        collection.add("I");
        collection.add("am");
        collection.add("hqq");
        System.out.println("========");
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());

        System.out.println(collection);
        //5.toArray 把集合转换成数组
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));

        //6.foreach
        for (String s : collection) {
            System.out.println(s);
        }

        //7.判定元素是否存在
        boolean ret = collection.contains("am");
        System.out.println(ret);

        //8.使用删除方法来删除指定元素
        collection.remove("hqq");
        for (String s: collection) {
            System.out.println(s);
        }

        //9.使用clear清空所有元素
        collection.clear();
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());
    }
}
