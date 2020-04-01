class Node {
    public int val;
    public Node prev;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class DoubleLinkedList {
    public Node last;
    Node newHead = new Node(-1);

    public DoubleLinkedList() {
        this.last = null;
    }

    public void display() {
        Node cur = this.newHead.next;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if(this.newHead.next == null) {
            this.last = node;
            node.prev = this.newHead;
            this.newHead.next = node;
        }else {
            node.prev = this.newHead.next.prev;
            node.next = this.newHead.next;
            node.next.prev = node;
            this.newHead.next = node;
        }
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if(this.newHead.next == null) {
            this.newHead.next = node;
            node.prev = this.newHead;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    public int size() {
        int count = 0;
        Node cur = this.newHead.next;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void addIndex(int index,int val) {
        if(index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("pos位置不合理");
        }
        if(index == 0) {
            addFirst(val);
            return;
        }
        if(index == size()) {
            addLast(val);
            return;
        }
        Node cur = findIndex(index);
        Node node = new Node(val);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev = node;
        node.prev.next = node;
    }
    public Node findIndex(int index) {
        Node cur = this.newHead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public boolean contains(int key) {
        if(this.newHead.next == null) {
            return false;
        }
        Node cur = this.newHead.next;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void remove(int key) {
        if(this.newHead.next == null) {
            return;
        }
        Node cur = this.newHead.next;
        while(cur != null) {
            if(cur.val == key) {
                if(cur == this.newHead.next) {
                    this.newHead.next = cur.next;
                    this.newHead.next.prev = this.newHead;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        this.last = cur.prev;
                    }else {
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }
            cur = cur.next;
            if(cur == null) {
                System.out.println("没有关键字");
            }
        }
    }
    public void removeAllKey(int key) {
        if(this.newHead.next == null) {
            return;
        }
        Node cur = this.newHead.next;
        while(cur != null) {
            if(cur.val == key) {
                if(cur == this.newHead.next) {
                    this.newHead.next = cur.next;
                    this.newHead.next.prev = this.newHead;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next == null) {
                        this.last = cur.prev;
                    }else {
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    public void clear() {
        this.newHead.next = null;
        this.last = null;
    }
}
