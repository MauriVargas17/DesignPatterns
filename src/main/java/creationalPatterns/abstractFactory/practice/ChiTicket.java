package abstractFactory.practice;

public class ChiTicket implements ITicket{
    private int flightNumber;
    private User user;
    private int seat;
    private int specialPrice;

    @Override
    public void showTicket() {
        System.out.println("Children Ticket");
        System.out.println("Flight number "+flightNumber);
        System.out.println("User "+user);
        System.out.println("Seat "+seat);
        System.out.println("Special price "+specialPrice);
        System.out.println();
    }

    public int getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(int specialPrice) {
        this.specialPrice = specialPrice;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

}
