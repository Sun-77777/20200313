public class MypriorityQueue {
    private int[] array = new int[100];
    private int size = 0;

    public void offer(int x) {
        //1.先把x放到数组元素的末尾
        array[size] = x;
        size++;
        //2.把x进行向上调整
        shiftUp(array,size,size-1);
    }

    private void shiftUp(int[] array, int size, int index) {
        int child = index;
        int parent = (child-1)/2;
        //如果child为0，说明child已经是根节点了。
        //调整到这里已经到顶了
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
        //1.把最后一个元素的值填到0号元素
        array[0] = array[size-1];
        //2.删除最后一个元素
        size--;
        //3.从0下标开始进行向下调整
        shiftDown(array,size,0);
        return ret;
    }

    private void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2*parent+1;
        while (child < size) {
            if (child+1 < size && array[child] < array[child+1]) {
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
            child = 2*parent+1;
        }
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return array[0];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MypriorityQueue queue = new MypriorityQueue();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(4);
        queue.offer(6);
        queue.offer(8);
        while (!queue.isEmpty()) {
            Integer cur = queue.poll();
            System.out.println(cur);
        }
    }
}
