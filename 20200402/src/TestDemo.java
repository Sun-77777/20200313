
class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
}
interface Swimming {
    void swim();
}
class Duck extends Animal implements Swimming {


    public Duck(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "会游泳");
    }
}

public class TestDemo {
    public static void swimming(Animal animal) {

    }
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子");
        duck.swim();
    }
}
