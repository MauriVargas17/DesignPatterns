package factoryMethod.practice;

public class SolTicketCreator extends TicketCreator{

    @Override
    public SolTicket createTicket() {
        System.out.println("Creating Solidarity Ticket");
        SolTicket sol = new SolTicket();
        sol.setCost(100);
        sol.setDestination(new Location("USA", "Chicago", "CHI"));
        sol.setOrigin(new Location("Bolivia", "El Alto", "LPZ"));
        sol.setFlight(12);
        sol.setPassenger(new Passenger("", 0));
        sol.setPlane(new Plane("Boeing", 500, "AS12X", 300));
        sol.setSeat(2);
        sol.setDiscount(20);
        sol.setMotive("Poverty");
        return sol;
    }
}
