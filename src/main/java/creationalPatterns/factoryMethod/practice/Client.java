package creationalPatterns.factoryMethod.practice;

public class Client {
    public static void main(String[] args){
        StdTicket t1 = new StdTicketCreator().createTicket();
        t1.setPassenger(new Passenger("Bobi", 123456));
        t1.showTicket();

        SolTicket t2 = new SolTicketCreator().createTicket();
        t2.setPassenger(new Passenger("Pedro", 126556));
        t2.showTicket();

        ChiTicket t3 = new ChiTicketCreator().createTicket();
        t3.setPassenger(new Passenger("Jose", 757353));
        t3.showTicket();

    }
}
