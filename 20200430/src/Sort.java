import java.util.Arrays;

public class Sort {
    //归并排序
    public static void mergeSort(int[] array) {
        mergeSortHelper(array,0,array.length);
    }

    private static void mergeSortHelper(int[] array, int left, int right) {
        if (right-left <= 1) {
            return;
        }
        int mid = (left+right)/2;
        mergeSortHelper(array,left,mid);
        mergeSortHelper(array,mid,right);
        merge(array,left,mid,right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int cur1 = left;
        int cur2 = mid;

        int[] output = new int[right-left];
        int outputIndex = 0;

        while (cur1 < mid && cur2 < right) {
            //相等时 先出现的放在前面
            if (array[cur1] <= array[cur2]) {
                output[outputIndex] = array[cur1];
                cur1++;
                outputIndex++;
            } else {
                output[outputIndex] = array[cur2];
                cur2++;
                outputIndex++;
            }
        }
        while (cur1 < mid) {
            output[outputIndex] = array[cur1];
            cur1++;
            outputIndex++;
        }
        while (cur2 < right) {
            output[outputIndex] = array[cur2];
            cur2++;
            outputIndex++;
        }

        for (int i = 0; i < right-left; i++) {
            array[left+i] = output[i];
        }
    }


    //堆排序
    public static void heapSort(int[] array) {
        //1.先建立对
        createHeap(array);
        int heapSize = array.length;
        for (int i = 0; i < array.length-1; i++) {
            //2.交换堆顶元素和最后一个元素
            swap(array,0,heapSize-1);
            heapSize--;
            //4.向下调整
            shiftDown(array,heapSize,0);
        }
    }

    private static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i >= 0 ; i--) {
            shiftDown(array,array.length,i);
        }
    }

    private static void shiftDown(int[] array, int length, int index) {
        int child = index;

    }


    //选择排序：每次从当前待排序区间中选取一个最小值，把最小值返回到bound位置上，同时bound ++
    public static void selectSort(int[] array) {
        for (int bound = 0; bound < array.length; bound++) {
            for (int cur = bound+1; cur < array.length; cur++) {
                if (array[cur] < array[bound]) {
                    swap(array,cur,bound);
                }
            }
        }
    }

    private static void swap(int[] array,int i,int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main(String[] args) {
        int[] array = {9,4,6,8,2,1};
        selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
