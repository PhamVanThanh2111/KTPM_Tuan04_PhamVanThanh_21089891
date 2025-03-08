package iuh.fit.se.ex1;

public class CancelledState implements OrderState{
    @Override
    public String getState() {
        return "CANCELLED";
    }

    @Override
    public String getPreState() {
        return "DELIVERED";
    }

    @Override
    public String getAfterState() {
        return "";
    }

    @Override
    public OrderState preState() {
        return new DeliveredState();
    }

    @Override
    public OrderState nextState() {
        return null;
    }
}
