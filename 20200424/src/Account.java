/**
 * 环境类，它是拥有状态的对象，维持了一个抽象状态的引用，可以通过setState()设置状态.
 */
public class Account {
    private AccountState state;
    private String owner;

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public AccountState getState() {
        return this.state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public Account(String owner, double init) {
        this.owner = owner;
        this.state = new GreenState(init,this);
        System.out.println(this.owner + "开户，" + "初始金额为" + init);
        System.out.println("--------------------------");
    }

    //存款
    public void deposit(double amount) {
        state.deposit(amount);
    }
    //取款
    public void withdraw(double amount) {
        state.withdraw(amount);
    }
}
