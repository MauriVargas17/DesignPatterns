package behavioralPatterns.chainOfResponsibility.inClassPractice;

public class ElFichas implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(boolean certi, boolean pago, boolean ficha) {

        if (certi && pago && !ficha){
            System.out.println("Requisito faltante: Ficha de atencion");
        } else {
            next.criteriaHandler(certi, pago, ficha);
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
