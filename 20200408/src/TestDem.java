public class TestDem {
    public static void main(String[] args) {
        String string = "hehe";
        String string1 = new String("hehe");
        System.out.println(string == string1);
        System.out.println(string.equals(string1));
        System.out.println("=====================");

        String string2 = new String("hehe").intern();
        System.out.println(string == string2);
        System.out.println(string.equals(string2));
    }
    public static void main1(String[] args) {
        //string-> char
        String str = "hehe";
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }
    }
}
