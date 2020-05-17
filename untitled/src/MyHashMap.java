public class MyHashMap {
    static class Node {
       public int key;
       public int value;
       Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private Node[] array = new Node[101];
    private int size = 0;

    public void put(int key,int value) {
        //1.根据key代入到hash函数中，计算到下标
        int index = hashFunc(key);
        //2.根据下标得到对应的链表
        Node head = array[index];
        //3.先判定key是否存在。如果存在就修改value()
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.key == key) {
                cur.value = value;
                return;
            }
        }
        //4.如果不存在再进行插入
        //链表头插比较简单一些
        Node newNode = new Node(key,value);
        newNode.next = head;
        array[index] = newNode;
        size++;
    }

    private int hashFunc(int key) {
        return key%array.length;
    }

    public Integer get(int key) {
        //1.根据key得到hash值
        int index = hashFunc(key);
        //2.在对应的链表上查找指定的key对应的结点
        Node head = array[index];
        for (Node cur = head;cur != null; cur = cur.next) {
            if (cur.key == key) {
                return cur.value;
            }
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
