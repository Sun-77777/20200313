public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public static final int DEFAULT_SIZE = 10;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
    //打印顺序表
    public void display() {
        for(int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }
    //在pos位置新增元素
    public void add(int pos, int data) {
        if (isFull()) {
            throw new RuntimeException("顺序表是满的");
        }
        checkPos(pos);
        for(int i = this.usedSize-1; i >= pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
//        int i = usedSize - 1;
//        while (i >= pos) {
//            this.elem[i + 1] = this.elem[i];
//            i--;
//        }
//        this.elem[pos] = data;
//        this.usedSize++;
    }

    public boolean isFull() {
        if(this.elem.length == this.usedSize) {
            return true;
        }
        return false;
    }

    //判定是否包含某个元素 先判断顺序表是否为空
    public boolean contains(int toFind) {
        if(isEmpty()) {
             return false;
        }
        for(int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
        /*for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }*/
    }
    public boolean isEmpty() {
        if(this.usedSize == 0) {
            return true;
        }
        return false;
    }
    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("pos位置错误");
        }
    }
    //查找某个元素对应的位置
    public int search(int toFind) {

        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos) {

        if (isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        return this.elem[pos];
    }
    //删除第一次出现的关键字
    public void remove(int key) {
        int ret = search(key);
        if(ret == -1) {
            return ;
        }
        for(int i = ret; i < this.usedSize-1; i++) {
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
