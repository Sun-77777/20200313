

public class TestWrapperClass {
    public static void main(String[] args) {
        //装箱
        Integer i = Integer.valueOf(10);

        //拆箱
        int j = i.intValue();

        //自动装箱
        Integer i1 = 10;
        //自动拆箱
        int j1 = i1;
    }
}
