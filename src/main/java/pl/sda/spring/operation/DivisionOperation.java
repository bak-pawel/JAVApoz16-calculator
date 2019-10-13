package pl.sda.spring.operation;

import org.springframework.stereotype.Component;
import sun.misc.Contended;

@Component
public class DivisionOperation implements Operation{
    @Override
    public double calculate(double arg1, double arg2) {
        double results = 0;
        if (arg2 == 0) {
            throw new RuntimeException("Nie dziel przez zero");
        } else {
            return arg1/arg2;
        }
    }

    @Override
    public OperationType getSupportedOperationType() {
        return OperationType.DEVISION;
    }
}
