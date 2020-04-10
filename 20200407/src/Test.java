public class Test {
    String str = new String("good");
    char[] chars = {'a','b','c'};

    public static void main(String[] args) {
        Test test = new Test();
        test.change(test.str,test.chars);
        System.out.print(test.str + "and");
        System.out.print(test.chars);
    }
    public void change(String str,char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}
