public class MyStackList {
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = new Node(-1);
    //头插
    public void push(int val) {

        Node node = new Node(val);
        node.next = head.next;
        head.next = node;
    }

    //头删
    public Integer pop() {
        if (this.head.next == null) {
            return null;
        }
        Node delNode = this.head.next;
        this.head.next = delNode.next;
        return delNode.val;
    }

    //取栈顶元素
    public Integer peek() {
        if (this.head.next == null) {
            return null;
        }
        return this.head.next.val;

    }
}
