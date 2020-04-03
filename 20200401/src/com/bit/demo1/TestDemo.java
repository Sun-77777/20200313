package com.bit.demo1;

class Base {
    public int a;

    static {
        System.out.println("base::static{}");
    }
    {
        System.out.println("base::{}");
    }

    public Base(int a) {
        this.a = a;
        System.out.println("base(int)");
    }
}
class Derive extends Base{
    public int b;
    static {
        System.out.println("derive::static{}");
    }
    {
        System.out.println("derive::{}");
    }
    public Derive(int a, int b) {
        super(a);
        System.out.println("derive(int,int)");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Derive derive = new Derive(2,3);
    }


}
