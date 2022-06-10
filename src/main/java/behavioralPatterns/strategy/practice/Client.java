package behavioralPatterns.strategy.practice;

public class Client {
    public static void main(String[] args){
        Shop shop = new Shop();
        shop.addGarments(new Garments("Hats", 4.99));
        shop.addGarments(new Garments("Scarfs", 9.99));
        shop.addGarments(new Garments("Sweaters", 19.99));
        shop.addGarments(new Garments("Pants", 39.99));
        shop.addGarments(new Garments("Jackets", 59.99));

        shop.setSeason(new Fall());

    }
}
