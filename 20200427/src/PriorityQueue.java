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

    public Integer poll() {
        if (size <= 0) {
            return null;
        }
        int ret = array[0];

        //1.把最后一个元素的值填入到0位置上
        array[0] = array[size-1];
        //2.删除最后一个元素
        size--;
        //3.从0下标开始向下调整
        shiftDown(array,size,0);
        return ret;
    }

    private void shiftDown(int[] array,int size,int index) {
        if (size <= 0) {
            return;
        }
        int parent = index;
        int child = parent*2+1;

        while (child < size) {
            if (child+1 < size && array[child+1] > array[child]) {
                child = child+1;
            }
            if (array[child] > array[parent]) {
                int tmp = array[parent];
                array[parent] = array[child];
                array[child] = tmp;
            } else {
                break;
            }
            parent = child;
            child = parent*2 + 1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        int ret = array[0];
        return ret;
    }

    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(4);
        priorityQueue.offer(12);
        priorityQueue.offer(1);

        Integer ret = priorityQueue.peek();
        System.out.println(ret);

        while (!priorityQueue.isEmpty()) {
            Integer cur = priorityQueue.poll();
            System.out.println(cur);
        }
    }

}
