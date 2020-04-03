class X {
    X() {
        System.out.println("X");
    }
}

public class TestDemo extends X{

    public static void main(String[] args) {
        new TestDemo();
        new X();
    }
}
