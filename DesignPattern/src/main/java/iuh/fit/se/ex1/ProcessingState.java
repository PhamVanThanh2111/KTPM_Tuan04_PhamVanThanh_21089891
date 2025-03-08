package iuh.fit.se.ex1;

public class ProcessingState implements OrderState {
    @Override
    public String getState() {
        return "PROCESSING";
    }

    @Override
    public String getPreState() {
        return "NEW";
    }

    @Override
    public String getAfterState() {
        return "DELIVERED";
    }

    @Override
    public OrderState preState() {
        return new NewState();
    }

    @Override
    public OrderState nextState() {
        return new DeliveredState();
    }
}
