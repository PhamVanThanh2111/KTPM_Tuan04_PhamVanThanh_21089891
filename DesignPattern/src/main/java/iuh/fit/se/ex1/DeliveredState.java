package iuh.fit.se.ex1;

public class DeliveredState implements OrderState{
    @Override
    public String getState() {
        return "DELIVERED";
    }

    @Override
    public String getPreState() {
        return "PROCESSING";
    }

    @Override
    public String getAfterState() {
        return "CANCELLED";
    }

    @Override
    public OrderState preState() {
        return new ProcessingState();
    }

    @Override
    public OrderState nextState() {
        return new CancelledState();
    }
}
