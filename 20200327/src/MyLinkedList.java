
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}

public class MyLinkedList {
    public Node head;

    public MyLinkedList() {
        this.head = null;
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
            return;
        }
        node.next = this.head;
        this.head = node;

    }
    public void addLast(int val) {
        Node node = new Node(val);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
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
            throw new ArrayIndexOutOfBoundsException("index位置不合理");
        }

        if(index == 0) {
            addFirst(val);
            return;
        }
        if(index == size()) {
            addLast(val);
            return;
        }
        Node prev = toFind(index);
        Node node = new Node(val);
        node.next = prev.next;
        prev.next = node;


    }
    private Node toFind(int index) {
        Node prev = this.head;
        for(int i = 0; i < index -1; i++) {
            prev = prev.next;
        }
        return prev;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
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
        if(this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = findPrev(key);
        if(prev == null) {
            System.out.println("没有关键字");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;


    }
    private Node findPrev(int key) {
        Node cur = this.head;
        while(cur.next != null) {
            if(cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.val == key) {
            this.head = this.head.next;
        }
    }

    public void clear() {
        
    }

}
