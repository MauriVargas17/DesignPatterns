package abstractFactory.practice;

public class Client {

    public static void main(String[] args){
        ITicket t1 = FactoryTicket.make(0);
        ITicket t2 = FactoryTicket.make(0);

        ITicket t3 = FactoryTicket.make(1);
        ITicket t4 = FactoryTicket.make(1);

        ITicket t5 = FactoryTicket.make(2);
        ITicket t6 = FactoryTicket.make(2);

        t1.showTicket();
        t3.showTicket();
        t5.showTicket();
    }



}
