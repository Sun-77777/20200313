import java.util.Arrays;

public class TestDemo1 {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(6);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.display();
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.addIndex(2,7);
        myLinkedList.display();
        myLinkedList.addIndex(7,10);
        myLinkedList.display();
        myLinkedList.addIndex(0,8);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(8));
        System.out.println(myLinkedList.contains(9));
//        myLinkedList.addIndex(10,0);
        myLinkedList.display();
        myLinkedList.remove(8);
        myLinkedList.display();
        myLinkedList.removeAllKey(2);
        myLinkedList.display();
    }

    public static void main2(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.display();
        System.out.println(myArrayList.contains(6));
        System.out.println(myArrayList.search(2));
        System.out.println(myArrayList.search(7));
        System.out.println(myArrayList.getPos(2));
        myArrayList.remove(2);
        myArrayList.display();
        System.out.println(myArrayList.size());
        myArrayList.display();
        System.out.println("======清空========");
        myArrayList.clear();


    }

    public static void main1(String[] args) {
        //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
        int[] array = {1,2,3,4,5,6,7,8,9};
        change(array);
        System.out.println(Arrays.toString(array));

    }
    public static void change(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            while(left < right && array[left]%2 == 0) {
                left++;
            }
            while(left < right && array[right]%2 != 0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }
    }
}
