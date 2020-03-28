import java.util.Arrays;

public class MyArrayList {
    private int[] elem;
    private int usedSize;

    private final int DEFAULT_SIZE = 3;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }

    private void grow() {
        this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
    }

    public void display() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        checkPos(pos);

        if(isFull()) {
//            throw new RuntimeException("顺序表已满");
            grow();
        }

        for(int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    public boolean isFull() {
        if(this.elem.length == this.usedSize) {
            return true;
        }
        return false;
    }

    public boolean contains(int toFind) {
        if(isEmpty()) {
            throw new RuntimeException("顺序表已空");
        }
        for(int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    private boolean isEmpty() {
        if(this.usedSize == 0) {
            return true;
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("pos位置不合理");
        }
    }

    //获取pos 位置的元素
    public int getPos(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        return this.elem[pos];
    }

    public void remove(int key) {
        int index = search(key);
        if(index == -1) {
            System.out.println("没有关键字");
            return;
        }
        for(int i = index; i < this.usedSize-1; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }

    public int size() {
        return this.usedSize;
    }

    public void clear() {
        this.usedSize = 0;
    }

}
