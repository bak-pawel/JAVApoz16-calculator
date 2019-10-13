package pl.sda.spring.operation;

public class PercentageOperation implements Operation {
    @Override
    public double calculate(double arg1, double arg2) {
        double perc = 100;
        return arg1*arg2/perc;
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.PERCENTAGE;
    }
}
