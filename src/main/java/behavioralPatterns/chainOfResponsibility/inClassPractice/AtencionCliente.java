package behavioralPatterns.chainOfResponsibility.inClassPractice;

public class AtencionCliente implements IHandler{
    private IHandler next;
    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public void criteriaHandler(boolean certi, boolean pago, boolean ficha) {

        if ((!certi && !pago && ficha) || (!certi && pago && !ficha) || (certi && !pago && !ficha) || (!certi && !pago && !ficha)){
            String a = "";
            String b = "";
            String c = "";
            if (!pago && !ficha && !certi){
                a = "Pago al banco";
                b = "Ficha de atencion";
                c ="Certificado de nacimiento";
            } else if(!certi && !pago){
                a = "Certificado de nacimiento";
                b = "Pago al banco";
            } else if(!certi && !ficha){
                a = "Certificado de nacimiento";
                b = "Ficha de atencion";
            } else if(!pago && !ficha){
                a = "Pago al banco";
                b = "Ficha de atencion";
            }
            System.out.println("Requisitos faltantes: "+a+", "+b+" "+ (!c.equals("") ? ", "+c : ""));
        }

    }

    @Override
    public IHandler next() {
        return next;
    }
}
