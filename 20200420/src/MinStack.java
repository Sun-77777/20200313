import java.util.Stack;

/**
 * 使用空间换时间
 * 把最小值使用一个栈来表示
 * B中的每个元素都对应了当前A这个栈某个状态下的最小值。
 */
public class MinStack {
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    public void push(int x) {
        A.push(x);
        if (B.empty()) {
            B.push(x);
            return;
        }
        Integer min = B.peek();
        if (min > x) {
            min = x;
        }
        B.push(min);
    }

    public void pop() {
        if (A.empty()) {
            return;
        }
        A.pop();
        B.pop();
    }

    public int top() {
        if (A.empty()) {
            return 0;
        }
        return A.peek();
    }

    public int getMin() {
        if (B.empty()) {
            return 0;
        }
        return B.peek();
    }
}
