public class TestDemo {

    public static void creatCycle(Node head) {
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = head.next.next;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(2);
        myLinkedList.addLast(5);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.display();

        myLinkedList.removeAllKey(2);
        myLinkedList.display();
//        creatCycle(myLinkedList.head);
//        System.out.println(myLinkedList.hasCycle());
//        Node ret = myLinkedList.dectCycle();
//        System.out.println(ret.data);
    }

    //输入两个链表，找出它们的第一个公共结点
    public static Node getCommonNode(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Node p = headA;
        Node q = headB;
        while (p != null || q != null) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
            if (p == q && p != null) {
                return p;
            }
        }
        return null;
    }

    public static void meetNode(Node headA, Node headB) {
        headA.next = headB.next.next;
    }
    public static void main3(String[] args) {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addLast(1);
        myLinkedList1.addLast(2);
        myLinkedList1.addLast(3);
        myLinkedList1.addLast(6);
        myLinkedList1.addLast(8);
        myLinkedList1.addLast(10);
        myLinkedList1.display();
        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(23);
        myLinkedList2.addLast(12);
        myLinkedList2.addLast(14);
        myLinkedList2.addLast(11);
        myLinkedList2.addLast(18);
        myLinkedList2.display();
        meetNode(myLinkedList1.head,myLinkedList2.head);
        myLinkedList1.display();
        myLinkedList2.display();
        Node ret = getCommonNode(myLinkedList1.head,myLinkedList2.head);
        System.out.println(ret.data);
    }

    public static void main2(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);

        myLinkedList.display();
        System.out.println(myLinkedList.isCircle());
    }


    public static void main1(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(3);
        myLinkedList.addLast(3);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.addLast(5);
        myLinkedList.display();
        Node ret = myLinkedList.remove();
        myLinkedList.display1(ret);

    }
}
