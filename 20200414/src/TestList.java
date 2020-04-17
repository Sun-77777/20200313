import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println("------------");
        list.set(2,6);
        System.out.println(list);
        System.out.println(list.get(2));

        System.out.println(list.contains(3));
        System.out.println(list.subList(0, 2));
        System.out.println(list);


    }
}
