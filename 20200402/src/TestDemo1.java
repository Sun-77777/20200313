import java.util.Arrays;

class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("bit",12,99);
        students[1] = new Student("bbb",22,77);
        students[2] = new Student("ccc",21,55);
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
