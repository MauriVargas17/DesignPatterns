package creationalPatterns.factoryMethod.example;

public class CIceCreamCreator extends Creator{
    @Override
    public CIceCream createIceCream() {
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
        Cream cream = new Cream();
        cream.setBrand("Pil");
        cream.setCost(3);
        cream.setTaste("Good");
        CIceCream cIC = new CIceCream(banana, cookie, cream);
        cIC.setSize("Huge");
        cIC.setShape("Circular");
        return cIC;
    }
}
