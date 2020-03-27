public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.display();
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.display();
        myLinkedList.addIndex(0,2);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(7));
        System.out.println(myLinkedList.contains(8));
        myLinkedList.remove(11);
        myLinkedList.display();
        myLinkedList.removeAllKey(2);
        myLinkedList.display();
    }
}
