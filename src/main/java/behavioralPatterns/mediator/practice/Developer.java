package behavioralPatterns.mediator.practice;

public class Developer extends Persona{
    private String language;

    public Developer(ICanalComunicacion canalComunication) {
        super(canalComunication);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
