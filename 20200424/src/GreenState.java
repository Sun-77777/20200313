/**
 * 具体状态类：绿色
 */
public class GreenState extends AccountState{

    @Override
    public void stateCheck() {
        if (balance < 0 && balance >= -1000) {
            acc.setState(new YellowState(this));
        }
        if (balance < -1000) {
            acc.setState(new RedState(this));
        }
    }

    public GreenState(double balance,Account acc) {
        this.balance = balance;
        this.acc = acc;
    }

    public GreenState(AccountState state) {
        this.acc = state.acc;
        this.balance = state.balance;
    }
}
