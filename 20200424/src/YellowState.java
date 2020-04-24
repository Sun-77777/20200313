/**
 * 具体状态类：黄色
 */
public class YellowState extends AccountState {
    @Override
    public void stateCheck() {
        if (balance >= 0) {
            acc.setState(new GreenState(this));
        }
        if (balance < -1000) {
            acc.setState(new RedState(this));
        }
    }

    public YellowState(AccountState state) {
        this.acc = state.acc;
        this.balance = state.balance;
    }
}
