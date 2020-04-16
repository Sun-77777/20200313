

public class MyStackArray {
    private int[] array = new int[100];
    private int size = 0;

    public void push(int value) {
        array[size] = value;
        size++;
    }

    public Integer pop() {
        if (size <= 0) {
            return null;
        }
        int ret = array[size-1];
        size--;
        return ret;
    }

    public Integer peek() {
        if (size <= 0) {
            return null;
        }

        int ret = array[size-1];
        return ret;
    }

    public static void main(String[] args) {
        MyStackArray myStackArray = new MyStackArray();
        myStackArray.push(1);
        myStackArray.push(2);
        myStackArray.push(3);
        myStackArray.push(4);

        while (true) {
            Integer cur = myStackArray.pop();
            if (cur == null) {
                break;
            }
            System.out.println(cur);
        }
    }
}
