package behavioralPatterns.mediator.practice;


public abstract class Persona {
    protected ICanalComunicacion canalComunication;
    private String name;
    private int ci;

    public Persona(ICanalComunicacion canalComunication){
        this.canalComunication = canalComunication;
    }

    public abstract void send(String msg);
    public abstract void receive(String msg);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
