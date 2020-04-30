public class Test1 {
    public static void insertSort(int[] array) {
        //[0,bound) 有序区间
        for (int bound = 1; bound < array.length; bound++) {
            //处理bound
            int tmp = array[bound];
            int cur = bound-1;
            for (; cur >= 0; cur--) {
                if (tmp < array[cur]) {
                    array[cur+1] = array[cur];
                } else {
                    break;
                }
            }
            array[cur+1] = tmp;
        }
    }
}
