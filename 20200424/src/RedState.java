/**
 * 具体状态类：红色
 */
public class RedState extends AccountState {
    @Override
    public void stateCheck() {
        if (balance < 0 && balance >= -1000) {
            acc.setState(new YellowState(this));
        }
        if (balance >= 0) {
            acc.setState(new GreenState(this));
        }
    }

    public RedState(AccountState state) {
        this.acc = state.acc;
        this.balance = state.balance;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println(this.acc.getOwner() + "取款" + amount);
        System.out.println("账户被冻结，取款失败");
        System.out.println("现在余额为" + balance);
        System.out.println("现在账户状态为：" + this.getClass().getName());
        System.out.println("--------------------------");
    }
}
