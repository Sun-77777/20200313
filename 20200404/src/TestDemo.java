interface IRunning {
    void run();
}

interface ISwimming {
    void swim();
}

interface IJumping {
    void jump();
}
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Duck extends Animal implements ISwimming,IRunning{

    public Duck(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "会跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "会游泳");
    }
}

public class TestDemo {
    //duck实现了IRunning 接口 所以可以传参
    public static void work(IRunning running) {
        running.run();
    }
    public static void main(String[] args) {
        Duck duck = new Duck("鸭子");
        work(duck);

    }
}
