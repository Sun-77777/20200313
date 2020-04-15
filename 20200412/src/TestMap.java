import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //1.实例化一个Map
        Map<String,String> map = new HashMap<>();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

        //3.put插入若干个键值对 通过key->找value 反向不行
        map.put("a","aaaaa");
        map.put("b","bbbbb");
        map.put("c","ccccc");

        //4.使用get根据key找value
        System.out.println(map.get("d"));

        //找到key 返回对应value；如果没找到key,返回默认值
        System.out.println(map.getOrDefault("c","ss"));

        //5.使用contains判定元素是否存在
        //containsKey 比较高效
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue("aaaaa"));

        //6.循环遍历Map 此处的Entry 表示“条目” 一个一个的键值对
        //对于map来说，保存的元素顺序和插入顺序无关
        //map 内部对于元素顺序有自己的规则

        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        //7.通过clear 清空所有元素
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.size());

    }
}
