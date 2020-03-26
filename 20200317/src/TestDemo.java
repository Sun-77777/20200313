class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return this.num1+this.num2;
    }
    public int min() {
        return this.num1-this.num2;
    }
    public int mul() {
        return this.num1 * this.num2;
    }
    public double div() {
        return (double) this.num1/this.num2;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator(3,6);
        System.out.println(c.add());
        System.out.println(c.min());
        System.out.println(c.mul());
        System.out.println(c.div());

    }
}
