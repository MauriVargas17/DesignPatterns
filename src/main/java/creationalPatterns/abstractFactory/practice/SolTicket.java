package creationalPatterns.abstractFactory.practice;

public class SolTicket implements ITicket{
    private int flightNumber;
    private User user;
    private int seat;
    private int cost;
    private int discount;

    @Override
    public void showTicket() {
        System.out.println("Solidarity Ticket");
        System.out.println("Flight number "+flightNumber);
        System.out.println("User "+user);
        System.out.println("Seat "+seat);
        System.out.println("Cost "+cost);
        System.out.println("Discount "+discount);
        System.out.println();
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
