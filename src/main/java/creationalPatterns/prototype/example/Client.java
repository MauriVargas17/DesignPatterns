package creationalPatterns.prototype.example;

public class Client {
    public static void main(String[] args){
        Team bolivia = new Team();
        bolivia.setRanking(68);
        bolivia.setStadiumName("Hernando Siles");
        bolivia.setName("Bolivia");

        Team brasil = new Team();
        brasil.setRanking(1);
        brasil.setStadiumName("El Grandioso");
        brasil.setName("Brasil");

        Ticket ticketTemplate = new Ticket();
        ticketTemplate.setLocal(bolivia);
        ticketTemplate.setVisitor(brasil);
        ticketTemplate.setDate("10/10/2022");
        ticketTemplate.setPrice(0);
        ticketTemplate.setStadium(ticketTemplate.getLocal().getStadiumName());
        ticketTemplate.setSeat(1);
        // Name is not introduced in the template

        Buyer peter = new Buyer();
        peter.setName("Peter");
        peter.setAge(23);
        peter.setId(12345);

        Buyer bob = new Buyer();
        bob.setName("Bob");
        bob.setAge(52);
        bob.setId(45839);

        Ticket ticket1 = (Ticket) ticketTemplate.clone();

        ticket1.setSeat(1);
        ticket1.setClient(peter);
        ticket1.setPrice(150);

        Ticket ticket2 = (Ticket) ticketTemplate.clone();

        ticket2.setSeat(2);
        ticket2.setClient(bob);
        ticket2.setPrice(200);

        ticket1.showInfo();
        System.out.println();
        ticket2.showInfo();

    }
}
