/**
 * 抽象状态类：它与环境类有一个双向的关联关系，
 * 定义了业务方法的通用实现，在没有状态子类覆盖的情况下
 * 默认调用这个类中定义的业务方法。
 */
public abstract class AccountState {
    protected Account acc;
    protected double balance;

    public abstract void stateCheck();

    public void deposit(double amount) {
        System.out.println(this.acc.getOwner() + "存款" + amount);
        balance += amount;
        stateCheck();
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在账户状态为：" + acc.getState().getClass().getName());
    }

    public void withdraw(double amount) {
        System.out.println(this.acc.getOwner() + "取款" + amount);
        balance -= amount;
        stateCheck();
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在账户状态为：" + acc.getState().getClass().getName());
    }

}
