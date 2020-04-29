public class PriorityQueue {
    private int[] array = new int[100];
    private int size = 0;

    public void offer(int x) {
        array[size] = x;
        size++;

        shiftUp(array,size,size-1);
    }

    public void shiftUp(int[] array,int size, int index) {
        int child = index;
        int parent = (index-1)/2;

        while (child > 0) {
            if (array[parent] < array[child]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            } else {
                break;
            }

            child = parent;
            parent = (child-1)/2;
        }
    }


}
