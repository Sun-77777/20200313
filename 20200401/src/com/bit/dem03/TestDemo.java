package com.bit.dem03;

/**
 * 接口注意事项：
 * 1.关键字abstract
 * 2.里面的数据成员必须是一个常量
 * public static final
 * 3.里面的成员方法是默认为public abstract
 * 4.在接口当中 不能定义一个已经实现的方法
 * 5.jdk1.8新特性 接口当中可以有实现的方法 但是这个方法一定是要default修饰的
 * 6.类和接口的关系 :  实现implements 可以实现多个接口
 * 7.解决了java当中 单继承的问题 可以变为多继承
 * 8.实现了该接口 一定要重写该接口当中的方法
 * 9.接口任然是不可以被实例化的
 *
 */
interface Shape {
    int a = 10;
    public abstract void draw();

    default void func() {

    }
}
class Cycle implements Shape {

    @Override
    public void draw() {
        System.out.println("花园");
    }
}
class Flower implements Shape {

    @Override
    public void draw() {
        System.out.println("花花");
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
}
