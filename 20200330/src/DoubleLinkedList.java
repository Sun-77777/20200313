
class Node {
    public int val;
    public Node prev;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class DoubleLinkedList {
    public Node head;
    public Node last;

    public DoubleLinkedList() {
        this.head = null;
        this.last = null;
    }

    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addFirst(int val) {
        Node node = new Node(val);
        if(this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        this.head.prev = node;
        node.next = this.head;
        this.head = node;
    }

    public void addLast(int val) {
        Node node = new Node(val);
        if(this.head == null) {
            this.head = node;
            this.last = node;
            return;
        }
        this.last.next = node;
        node.prev = this.last;
        this.last = node;
    }

    public int size() {
        int count = 0;
        Node cur = this.head;
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
        Node cur = this.head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public boolean contains(int key) {
        if(this.head == null) {
            return false;
        }
        Node cur = this.head;
        while(cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        Node cur = this.head;
        while(cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    this.head = cur.next;
                    this.head.prev = null;
                    return;
                }
                cur.prev.next = cur.next;
                if(cur.next == null) {
                    this.last = cur.prev;
                    return;
                }
                cur.next.prev = cur.prev;
                return;
            }
            cur = cur.next;
            if(cur == null) {
                System.out.println("没有关键字");
            }
        }
    }
    public void removeAllKey(int key) {
        if(this.head == null) {
            return;
        }
        Node cur = this.head;
        while(cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    this.head = cur.next;
                    this.head.prev = null;
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
        this.head = null;
        this.last = null;
    }
}
