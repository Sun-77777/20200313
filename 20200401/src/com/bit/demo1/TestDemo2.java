package com.bit.demo1;

class Shape {
    public void draw() {

    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("这是一个圆");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("画花");
    }
}
public class TestDemo2 {
    //类的调用者
    public static void drawMap(Shape shape) {
        shape.draw();
    }
    public static void main1(String[] args) {
        Shape shape = new Cycle();
        drawMap(shape);
        Shape shape1 = new Flower();
        drawMap(shape1);
    }
}
