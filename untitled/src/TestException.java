public class TestException {
    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        login("admin","123456");
    }

    private static void login(String userName, String password) {
        if (!userName.equals("admin")) {
            //处理用户名错误
        }
        if (!password.equals("123456")) {
            //处理密码错误
        }
        System.out.println("登陆成功");
    }
}
