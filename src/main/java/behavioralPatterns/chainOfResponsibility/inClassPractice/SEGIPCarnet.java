package behavioralPatterns.chainOfResponsibility.inClassPractice;

public class SEGIPCarnet implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(boolean certi, boolean pago, boolean ficha) {
        Notario notario= new Notario();
        this.setNext(notario);

        Banco banco = new Banco();
        notario.setNext(banco);

        ElFichas elFichas = new ElFichas();
        banco.setNext(elFichas);

        AtencionCliente atencionCliente = new AtencionCliente();
        elFichas.setNext(atencionCliente);

        if (certi && pago && ficha){
            System.out.println("Imprimiendo carnet");
        } else {
           this.next.criteriaHandler(certi, pago, ficha);
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}
