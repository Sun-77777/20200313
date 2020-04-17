public class MyStack {
    //栈可以基于顺序表实现,也可以基于链表实现
    private int[] array = new int[100];
    private int size = 0;

    //栈：后进先出
    //入栈(数组尾部添加)
    public void push(int value) {
        //把value放到数组末尾，此处不考虑扩容
        array[size] = value;
        size++;
    }

    //出栈(数组尾部删除)
    public Integer pop() {
        if (size <= 0) {
            //此处的失败可以有两种表示方式
            //可以返回非法值
            return null;
        }
        int ret = array[size-1];
        size--;
        return ret;
    }

    //取出栈顶元素(数组尾部元素)
    public Integer peek() {
        if (size < 0) {
            return null;
        }
        int ret = array[size-1];
        return ret;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);


        while (true) {
            Integer cur = myStack.peek();
            if (cur == null) {
                break;
            }
            System.out.println(cur);
        }
    }
}
