import java.util.Arrays;

class Student implements Comparable<Student>{
    protected String name;
    protected int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //把对象重写
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("aa",21);
        students[1] = new Student("bb",12);
        students[2] = new Student("cc",4);
        Arrays.sort(students);
        //打印数组
        System.out.println(Arrays.toString(students));
    }
    public static void main1(String[] args) {
        int[] array = {1,3,2,6,9,7,8,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
