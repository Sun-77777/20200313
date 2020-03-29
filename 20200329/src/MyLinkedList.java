
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

    //删除链表中等于给定值 val 的所有节点
    public void removeAllKey(int key) {
        Node cur = this.head.next;
        Node prev = this.head;
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

    public Node middleNode() {
        if(this.head == null) {
            return null;
        }
        Node slow = this.head;
        Node fast = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverse() {
        if(this.head == null) {
            return null;
        }
        Node cur = this.head;
        Node prev = null;

        while(cur != null) {
            Node curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
    public Node findKthToTail(int k) {
        if(this.head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        for (int i = 0; i < k-1; i++) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next;
        }
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public Node partition(int x) {
        Node cur = this.head;
        Node bs = null;
        Node be = null;
        Node as = null;
        Node ae = null;

        while(cur != null) {
            if(cur.data < x) {
                if(bs == null) {
                    bs = cur;
                    be = bs;
                    cur = cur.next;
                }else {
                    be.next = cur;
                    be = be.next;
                    cur = cur.next;
                }
            }else {
                if(as == null) {
                    as = cur;
                    ae = as;
                    cur = cur.next;
                }else {
                    ae.next = cur;
                    ae = ae.next;
                    cur = cur.next;
                }
            }
        }
        if(bs == null) {
            return as;
        }
        be.next = as;
        if(ae.next != null) {
            ae.next = null;
        }
        return bs;
    }

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public Node dectCycle() {
        Node fast = this.head;
        Node slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                break;
            }
        }
        if(fast != null) {
            slow = this.head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
    //给定一个链表，判断链表中是否有环。
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }


    //链表的回文结构
    public boolean isCircle() {
        Node slow = this.head;
        Node fast = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //找到中间结点
        Node cur = slow.next;

        while(cur != null) {
            Node curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        while(this.head != slow) {
            if(this.head.data != slow.data) {
                return false;
            }
            //偶数情况
            if(this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;

    }

    //在一个排序的链表中，存在重复的结点，
    // 请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public void display1(Node node) {

        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public Node remove() {
        if(this.head == null) {
            return null;
        }
        Node node = new Node(-1);
        Node tmp = node;
        Node cur = this.head;
        while(cur != null) {
            if(cur.next != null && cur.data == cur.next.data) {
                while(cur.next != null &&cur.data == cur.next.data) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur;
                cur = cur.next;
                tmp = tmp.next;
            }
        }
        if(tmp.next != null) {
            tmp.next = null;
        }
        return node.next;
    }

    public void addLast(int data) {
        Node node = new Node(data);
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

    public void display() {
        Node cur = this.head;
        while(cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}
