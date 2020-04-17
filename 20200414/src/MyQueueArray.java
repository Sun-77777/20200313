/**
 * 如果通过搬运的方式实现队列，效率低o(n)
 * [head,tail)  tail++; head++;
 */

public class MyQueueArray {
    private int[] array = new int[100];

    private int head = 0;
    private int tail = 0;
    private int size = 0;

    public boolean offer(int value) {
        if (size == array.length) {
            return false;
        }
        array[tail] = value;
        tail++;
        if (tail >= array.length) {
            tail = 0;
        }
        //tail = tail % array.length;
        size++;
        return true;
    }

    public Integer poll() {
        if (size == 0) {
            return null;
        }

        int ret = array[head];
        head++;
        if (head >= array.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return array[head];
    }

    public static void main(String[] args) {
        MyQueueArray myQueueArray = new MyQueueArray();
        myQueueArray.offer(1);
        myQueueArray.offer(2);
        myQueueArray.offer(3);
        myQueueArray.offer(4);



    }

}
