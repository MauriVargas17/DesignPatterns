package abstractFactory.practice;

public class FactoryTicket {
    public static ITicket make(int ticket){
        ITicket it;
        TicketsList ticketPos = TicketsList.values()[ticket];
        switch (ticketPos){
            case Children -> it = new ChiTicket();
            case Standard -> it = new StdTicket();
            default -> it = new SolTicket();
        }
        return it;
    }
}
