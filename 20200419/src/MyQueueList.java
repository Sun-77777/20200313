/**
 * 链表版本的队列：插入元素无上限 效率更低  需要额外的内从空间保存引用地址
 * 数组版本的队列：插入元素有上限。效率更高
 * 标准库中的queue基于链表实现的
 */

public class MyQueueList {
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    Node head = new Node(-1);
    Node tail = head;

    //入队列(尾插)
    public void offer(int value) {
        Node node = new Node(value);
        tail.next = node;
        tail = tail.next;
    }
    //出队列头删
    public Integer poll() {
        if (head.next == null) {
            return null;
        }
        Node delNode = head.next;
        head.next = delNode.next;

        //不要忘了更新尾部，链表只有一个结点
        if (head.next == null) {
            //此时队列为空
            tail = head;
        }
        return delNode.val;

    }

    public Integer peek() {
        if (head.next == null) {
            return null;
        }
        return head.next.val;
    }

    public static void main(String[] args) {
        MyQueueList myQueueList = new MyQueueList();
        myQueueList.offer(1);
        myQueueList.offer(2);
        myQueueList.offer(3);
        myQueueList.offer(4);

        while (true) {
            Integer cur = myQueueList.poll();
            if (cur == null) {
                break;
            }
            System.out.println(cur);
        }
    }
}
