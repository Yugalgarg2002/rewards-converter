public class RewardValue {
    private double milesValue;
    private double cashValue;

    RewardValue(double cashValue) {
        this.milesValue = cashValue * 0.0035;
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }
}
