public class Test {
    public static void main(String[] args) {
        //string -> byte
        String str = "hehe";
        byte[] bytes = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //byte -> string
        String str1 = new String(bytes);
        System.out.println(str1);
    }
}
