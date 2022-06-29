package creationalPatterns.factoryMethod.example;

public class WIceCreamCreator extends Creator{

    @Override
    public WIceCream createIceCream() {
        Fruit banana = new Fruit();
        banana.setCost(3);
        banana.setSize("Small");
        banana.setType("Tropical");
        banana.setName("Banana");
        Base cookie = new Base();
        cookie.setCost(4);
        cookie.setName("Cookie");
        cookie.setSize("Medium");
        cookie.setType("Sweet");
        WIceCream wIC = new WIceCream(banana, cookie);
        wIC.setSize("Huge");
        wIC.setShape("Circular");
        return wIC;
    }
}
