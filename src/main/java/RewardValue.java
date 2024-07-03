public class RewardValue {
    private double milesValue;

    RewardValue(double cashValue) {
        this.milesValue = cashValue * 0.0035;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
