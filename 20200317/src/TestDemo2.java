import java.util.Arrays;

class Arr {
    private int[] array1;
    private int[] array2;

    public Arr(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public void swap() {
        int len = array1.length;
        int i = 0;

        while(len > 0) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
            i++;
            len--;
        }
    }
}
class MyValue {
    public int val;
}
public class TestDemo2 {
    public static void swap(MyValue myValue1,MyValue myValue2) {
        int tmp = myValue1.val;
        myValue1.val = myValue2.val;
        myValue2.val = tmp;
    }

    public static void main(String[] args) {
        MyValue myValue1 = new MyValue();
        myValue1.val = 10;
        MyValue myValue2 = new MyValue();
        myValue2.val = 20;
        System.out.println(myValue1.val + " " + myValue2.val);
        swap(myValue1,myValue2);
        System.out.println(myValue1.val +" " + myValue2.val);
    }

    public static void main1(String[] args) {
        //给定两个整型数组, 交换两个数组的内容.
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8};
        Arr a = new Arr(array1,array2);
        a.swap();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
