import java.util.Stack;

public class MyQueue {
    //用栈实现队列

    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!B.empty()) {
            Integer cur = B.pop();
            A.push(cur);
        }
        A.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (empty()) {
            return 0;
        }
        while (!A.isEmpty()) {
            Integer cur = A.pop();
            B.push(cur);
        }
        int ret = B.pop();
        return ret;
    }

    /** Get the front element. */
    public int peek() {
        if (empty()) {
            return 0;
        }
        while (!A.isEmpty()) {
            Integer cur = A.pop();
            B.push(cur);
        }
        return B.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return A.empty() && B.empty();
    }
}
