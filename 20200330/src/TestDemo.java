public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addFirst(1);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.addFirst(3);
        doubleLinkedList.addFirst(2);
        doubleLinkedList.display();
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(6);
        doubleLinkedList.addLast(7);
        doubleLinkedList.display();
        doubleLinkedList.addIndex(0,2);
        doubleLinkedList.addIndex(2,10);
        doubleLinkedList.addIndex(9,2);
        doubleLinkedList.display();
        System.out.println(doubleLinkedList.contains(9));
        doubleLinkedList.removeAllKey(2);
        doubleLinkedList.display();
        doubleLinkedList.clear();
        doubleLinkedList.display();
    }
}
