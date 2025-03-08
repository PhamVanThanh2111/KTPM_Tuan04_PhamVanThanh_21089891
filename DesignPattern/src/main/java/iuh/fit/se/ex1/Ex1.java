package iuh.fit.se.ex1;

public class Ex1 {
    public static void main(String[] args) {
        OrderState processingState = new ProcessingState();

        System.out.println(processingState.getPreState());
        System.out.println(processingState.getState());
        System.out.println(processingState.getAfterState());

        System.out.println("-------------------");
        System.out.println("TO NEXT STATE:");
        OrderState deliveredState = processingState.nextState();
        System.out.println(deliveredState.getState());
        System.out.println("-------------------");
        System.out.println("TO PRE-STATE:");
        OrderState processingState1 = deliveredState.preState();
        System.out.println(processingState1.getState());
    }
}