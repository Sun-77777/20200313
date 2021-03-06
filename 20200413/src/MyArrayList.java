
class Student {
    public String name;
}
public class MyArrayList<E> {
    private E[] array =(E[]) new Object[100];
    private int size;

    void add(E o) {
        array[size] = o;
        size++;
    }

    E get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("a");
        myArrayList.add("b");
        myArrayList.add("c");
        String ret = myArrayList.get(0);
        System.out.println(ret);

        MyArrayList<Student> myArrayList1 = new MyArrayList<>();
        myArrayList1.add(new Student());
        myArrayList1.add(new Student());

        Student s = myArrayList1.get(0);
        System.out.println(s);
    }

    public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("i");
        myArrayList.add("b");
        myArrayList.add("c");
        String ret = (String)myArrayList.get(0);

        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add(new Student());
        myArrayList1.add(new Student());
    }
}
