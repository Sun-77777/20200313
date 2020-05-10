public class Test {
    public static void bubbleSort(int[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = array.length-1; cur > bound; cur++) {
                if (array[cur] < array[cur-1]) {
                    int tmp = array[cur];
                    array[cur] = array[cur-1];
                    array[cur-1] = tmp;
                }
            }
        }
    }
    public static void selectSort(int[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = bound; cur < array.length; cur++) {
                if (array[cur] < array[bound]) {
                    int tmp = array[cur];
                    array[cur] = array[bound];
                    array[bound] = tmp;
                }
            }
        }
    }
}
