package behavioralPatterns.chainOfResponsibility.inClassPractice;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(boolean certi, boolean pago, boolean ficha);
    IHandler next();
}