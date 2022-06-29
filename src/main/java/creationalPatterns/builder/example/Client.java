package creationalPatterns.builder.example;

public class Client {
    public static void main(String[] args){
        Owner owner = new Owner();
        I9Builder pc1Builder = new I9Builder();
        I7Builder pc2Builder = new I7Builder();
        I5Builder pc3Builder = new I5Builder();

        owner.setBuilder(pc2Builder);
        owner.createPC();
        PC pc = owner.getPC();
        pc.showInfo();
    }
}
