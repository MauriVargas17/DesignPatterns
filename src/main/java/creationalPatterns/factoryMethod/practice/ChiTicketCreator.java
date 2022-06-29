package creationalPatterns.factoryMethod.practice;

public class ChiTicketCreator extends TicketCreator{
    @Override
    public ChiTicket createTicket() {
        System.out.println("Creating Solidarity Ticket");
        ChiTicket chi = new ChiTicket();
        chi.setCost(100);
        chi.setDestination(new Location("USA", "Chicago", "CHI"));
        chi.setOrigin(new Location("Bolivia", "El Alto", "LPZ"));
        chi.setFlight(12);
        chi.setPassenger(new Passenger("", 0));
        chi.setPlane(new Plane("Boeing", 500, "AS12X", 300));
        chi.setSeat(2);
        return chi;
    }
}
