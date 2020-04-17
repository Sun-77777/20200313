import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestStackAndQueue {
    public static void main(String[] args) {

        //Stack 在标准库中是一个类
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //标准库中的stack 如果针对空栈进行pop或者peek 就会抛出一个异常
        while (!stack.empty()) {
            Integer cur = stack.pop();
            System.out.println(cur);
        }

        //标准库中的队列
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        while (!queue.isEmpty()) {
            Integer cur = queue.poll();
            System.out.println(cur);
        }
    }
}
