package factoryMethod.practice;

public class SolTicket implements ITicket{
    private int flight;
    private Location destination;
    private Location origin;
    private Plane plane;
    private Passenger passenger;
    private int seat;
    private int cost;
    private int discount;
    private String motive;


    @Override
    public void showTicket() {
        System.out.println("Solidarity Ticket: ");
        System.out.println("Flight "+flight);
        System.out.println("Seat "+seat);
        System.out.println("Origin "+origin.getAirport());
        System.out.println("Destination "+destination.getAirport());
        System.out.println("Passenger "+passenger.getName());
        System.out.println("Plane "+plane.getManufacturer());
        System.out.println("Price "+cost);
        System.out.println("Discount "+discount);
        System.out.println("Motive of discount "+motive);
        System.out.println();

    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getMotive() {
        return motive;
    }

    public void setMotive(String motive) {
        this.motive = motive;
    }
}
