package behavioralPatterns.chainOfResponsibility.practice;

public class ComplexityManager implements IHandler{

    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(int[] arr) {

        Alg1 al1 = new Alg1();
        setNext(al1);
        Alg2 al2 = new Alg2();
        al1.setNext(al2);
        Alg3 al3 = new Alg3();
        al2.setNext(al3);

        next.criteriaHandler(arr);
    }

    @Override
    public IHandler next() {
        return next;
    }
}
