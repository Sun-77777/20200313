
class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
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
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if(this.head == null) {
            head = node;
            return;
        }
        Node cur = this.head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;

    }
    public int size() {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index < 0 || index > size()) {
            throw new ArrayIndexOutOfBoundsException("index位置不合理");
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }

        Node node = new Node(data);
        Node prev = findPrev(index);
        node.next = prev.next;
        prev.next = node;
    }
    public Node findPrev(int index) {
        Node prev = this.head;

        while(index > 1) {
            prev = prev.next;
            index--;
        }
        return prev;
    }
    public void remove(int key) {
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = toPrev(key);
        if(prev == null) {
            System.out.println("没有关键字");
            return;
        }
        Node del = prev.next;
        prev.next = del.next;

    }
    public Node toPrev(int key) {
        Node prev = this.head;
        while(prev.next != null) {
            if(prev.next.data == key) {
                return prev;
            }
            prev = prev.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove1(int key) {
        if(findIndex(key) == -1) {
            System.out.println("没有关键字");
            return;
        }
        if(this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = findPrev(findIndex(key));
        Node del = prev.next;
        prev.next = del.next;

    }
    public int findIndex(int key) {
        Node cur = this.head;
        int count = 0;
        while(cur != null) {
            if(cur.data != key) {
                cur = cur.next;
                count++;
            }else {
                return count;
            }
        }
        return -1;
    }
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while(cur != null) {
            if(cur.data == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.next;
        }
    }
    public void removeAllKey2(int key) {
        if(this.head.data == key) {
            this.head = this.head.next;
        }
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                Node prev = toPrev(key);
                Node del = prev.next;
                prev.next = del.next;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey1(int key) {
        if(this.head.data == key) {
            this.head = this.head.next;
        }
        Node cur = this.head;
        while(cur != null) {
            if(cur.data == key) {
                remove(key);
            }
            cur = cur.next;
        }


    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while(cur != null) {
            if(cur.data != key) {
                cur = cur.next;
            }else {
                return true;
            }
        }
        return false;
    }
}
