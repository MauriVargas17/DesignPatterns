package behavioralPatterns.chainOfResponsibility.inClassPractice;

public class Notario implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(boolean certi, boolean pago, boolean ficha) {

        if (!certi && pago && ficha){
            System.out.println("Requisito faltante: Certificado de nacimiento");
        } else {
            next.criteriaHandler(certi, pago, ficha);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
