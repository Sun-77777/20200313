import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {1,9,8,2,3,4,5};
        bubblesort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubblesort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean flg = true;
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = false;
                }
            }
            if(flg) {
                break;
            }
        }
    }
}
