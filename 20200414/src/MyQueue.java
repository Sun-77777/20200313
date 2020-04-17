/**
 * 链表版本的队列：插入元素无上限 效率更低  需要额外的内从空间保存引用地址
 * 数组版本的队列：插入元素有上限。效率更高
 * 标准库中的queue基于链表实现的
 */

public class MyQueue {
    //先用链表的方式实现（简单一些）
    //
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = new Node(-1);
    Node tail = head;
    private int size;

    //入队列（链表尾插）
    public void offer(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = tail.next;
    }

    //出队列（链表头删）
    public Integer poll() {
        if (head.next == null) {
            //队列为空，出队列失败
            return null;
        }
        Node toDelete = head.next;
        head.next = toDelete.next;

        if (head.next == null) {
            tail = head;
        }
        return toDelete.val;

    }

    //取队首元素
    public Integer peek() {
        if (head.next == null) {
            return null;
        }
        return head.next.val;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
    }
}
