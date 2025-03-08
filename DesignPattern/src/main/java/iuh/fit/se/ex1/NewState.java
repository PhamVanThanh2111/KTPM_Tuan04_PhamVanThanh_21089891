package iuh.fit.se.ex1;

public class NewState implements OrderState {
    @Override
    public String getState() {
        return "NEW";
    }

    @Override
    public String getPreState() {
        return "";
    }

    @Override
    public String getAfterState() {
        return "PROCESSING";
    }

    @Override
    public OrderState preState() {
        return null;
    }

    @Override
    public OrderState nextState() {
        return new ProcessingState();
    }
}
