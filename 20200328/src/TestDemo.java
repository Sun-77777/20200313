public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.display();
        System.out.println(myArrayList.contains(2));
        System.out.println(myArrayList.search(3));
        System.out.println(myArrayList.getPos(3));
        myArrayList.remove(8);
        myArrayList.display();
        System.out.println(myArrayList.size());

        System.out.println("*******扩容*******");
        myArrayList.display();

    }
}
