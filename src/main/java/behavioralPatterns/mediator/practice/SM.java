package behavioralPatterns.mediator.practice;

public class SM extends Persona{
    private String certi;

    public SM(ICanalComunicacion canalComunication) {
        super(canalComunication);
    }

    public String getCerti() {
        return certi;
    }

    public void setCerti(String certi) {
        this.certi = certi;
    }

    @Override
    public void send(String msg) {
        canalComunication.send(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("CONFIR> "+getName()+" received message "+msg);
    }
}
