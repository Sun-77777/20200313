public class MyStackList {
    static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }

        Node head = new Node(-1);

        public void push(int value) {
            Node node = new Node(value);
            node.next = head.next;
            head.next = node;
        }

        public Integer pop() {
            if (head.next == null) {
                return null;
            }
            Node delNode = head.next;
            head.next = delNode.next;
            return delNode.val;
        }

        public Integer peek() {
            if (head.next == null) {
                return null;
            }
            return head.next.val;
        }


    }


}
