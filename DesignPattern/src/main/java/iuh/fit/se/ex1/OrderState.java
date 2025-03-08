package iuh.fit.se.ex1;

public interface OrderState {
     String getState();
     String getPreState();
     String getAfterState();
     OrderState preState();
     OrderState nextState();
}
