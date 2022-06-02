package behavioralPatterns.mediator.practice;

public class QA extends Persona{
    private String grado;

    public QA(ICanalComunicacion canalComunication) {
        super(canalComunication);
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
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
