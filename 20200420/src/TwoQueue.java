import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 */
public class TwoQueue {
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();


    public void push(int x) {
        A.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (empty()) {
            return 0;
        }
        while (A.size() > 1) {
            Integer cur = A.poll();
            B.offer(cur);
        }
        Integer ret = A.poll();
        swap();
        return ret;
    }
    private void swap() {
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }

    /** Get the top element. */
    public int top() {
        if (empty()) {
            return 0;
        }
        while (A.size() > 1) {
            Integer cur = A.poll();
            B.offer(cur);
        }
        Integer ret = A.poll();
        B.offer(ret);
        swap();
        return ret;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
