/**
 * 客户端测试类
 */
public class Client {

    public static void main(String[] args) {
        Account account = new Account("马云",5.0);
        account.deposit(100.0);
        System.out.println("--------------------------");
        account.withdraw(200.0);
        System.out.println("--------------------------");
        account.deposit(1000.0);
        System.out.println("--------------------------");
        account.withdraw(2000.0);
        System.out.println("--------------------------");
        account.withdraw(100.0);

    }
}
