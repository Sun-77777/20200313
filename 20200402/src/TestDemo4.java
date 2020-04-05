
class Mom implements Cloneable{
    public int money = 12;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Student1 implements Cloneable{
    public int score;
    public Mom mom;

    public Student1(int score) {
        this.score = score;
        this.mom = new Mom();
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student1 student1 = (Student1)super.clone();
        student1.mom = (Mom)this.mom.clone();
        return student1;
    }
}

public class TestDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student1 student = new Student1(10);
        Student1 student1 = (Student1) student.clone();
        System.out.println(student.mom.money);
        System.out.println(student1.mom.money);
        System.out.println("==============");
        student1.mom.money = 20;
        System.out.println(student.mom.money);
        System.out.println(student1.mom.money);

    }
}
