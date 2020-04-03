package com.bit.demo2;

/**
 * 抽象类：包含抽象方法的类，我们把它叫做抽象类
 * 1.用关键字abstract进行修饰
 * 2.在抽象类当中 可以有普通类的所有属性
 * 3.和普通的类 不一样的地方就是包含了抽象方法
 * 4.和普通的类 不一样的地方就是 他不能够被实例化
 * 5.抽象类的作用就是用来被继承的
 * 6.抽象类就是用来被继承的 所以： 不能被final修饰
 * 7.抽象方法 也不能是私有的 不能是静态的  可以是protected
 * 8.抽象方法：没有具体实现的方法
 * 9.只要有一个类，继承了这个抽象类 那么 必须要重写抽象类当中的方法
 * 9.如果这个类，不想重写抽象类里面的抽象方法。那么此时这个类也可以设置为抽象类。
 *
 */

/**
 * 面试问题: 抽象类和普通类的区别？？
 */
abstract class Shape {
    public abstract void draw();
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画花");
    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
public class TestDemo {
    public static void shapeMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        shapeMap(shape1);
        Shape shape2 = new Flower();
        shapeMap(shape2);
    }
    public static void main1(String[] args) {
        Flower flower = new Flower();
        shapeMap(flower);
        Cycle cycle = new Cycle();
        shapeMap(cycle);
    }
}
