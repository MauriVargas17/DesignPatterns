package creationalPatterns.factoryMethod.practice;

public class StdTicketCreator extends TicketCreator{

    @Override
    public StdTicket createTicket() {
        System.out.println("Creating Standard Ticket");
        StdTicket std = new StdTicket();
        std.setCost(100);
        std.setDestination(new Location("USA", "Chicago", "CHI"));
        std.setOrigin(new Location("Bolivia", "El Alto", "LPZ"));
        std.setFlight(12);
        std.setPassenger(new Passenger("", 0));
        std.setPlane(new Plane("Boeing", 500, "AS12X", 300));
        std.setSeat(2);
        return std;
    }
}
