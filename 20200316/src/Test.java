import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
        int[] array = {1,2,3,4,5,6,7,8,9};
        transform(array);
        System.out.println(Arrays.toString(array));
    }
    public static void transform(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }
            while (left <right && array[right] % 2 !=0) {
                right--;
            }
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;

        }
    }

}
