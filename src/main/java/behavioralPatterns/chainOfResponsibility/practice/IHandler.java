package behavioralPatterns.chainOfResponsibility.practice;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(int[] arr);
    IHandler next();
}
