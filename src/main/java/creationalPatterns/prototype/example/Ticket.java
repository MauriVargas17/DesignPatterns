package creationalPatterns.prototype.example;

public class Ticket implements Cloneable{
    private Team local = new Team();
    private Team visitor = new Team();
    private int seat;
    private String date;
    private String stadium;
    private int price;
    private Buyer client;

    @Override
    public Object clone(){

        Team cloneL = new Team();
        cloneL.setName(this.getLocal().getName());
        cloneL.setStadiumName(this.getLocal().getStadiumName());
        cloneL.setRanking(this.getLocal().getRanking());

        Team cloneV = new Team();
        cloneV.setName(this.getVisitor().getName());
        cloneV.setStadiumName(this.getVisitor().getStadiumName());
        cloneV.setRanking(this.getVisitor().getRanking());

        Ticket clone = new Ticket();

        clone.setLocal(cloneL);
        clone.setVisitor(cloneV);
        clone.setSeat(getSeat());
        clone.setDate(getDate());
        clone.setStadium(getStadium());
        clone.setPrice(getPrice());
        clone.setClient(getClient());
        return clone;
    }

    public void showInfo(){
        System.out.println("Local: "+local.getName());
        System.out.println("-- Ranking: "+local.getRanking());
        System.out.println("Visitor: "+visitor.getName());
        System.out.println("-- Ranking: "+visitor.getRanking());
        System.out.println("Stadium: "+stadium);
        System.out.println("Price: "+price);
        System.out.println("Date: "+date);
        System.out.println("Seat: "+seat);
        System.out.println("Client name: "+client.getName());
        System.out.println("-- Client id: "+client.getId());
        System.out.println("-- Client age: "+client.getAge());

    }

    public Team getLocal() {
        return local;
    }

    public void setLocal(Team local) {
        this.local = local;
    }

    public Team getVisitor() {
        return visitor;
    }

    public void setVisitor(Team visitor) {
        this.visitor = visitor;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Buyer getClient() {
        return client;
    }

    public void setClient(Buyer client) {
        this.client = client;
    }
}
