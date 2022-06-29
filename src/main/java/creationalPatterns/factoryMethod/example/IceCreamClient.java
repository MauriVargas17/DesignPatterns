package creationalPatterns.factoryMethod.example;

public class IceCreamClient {
    public static void main(String[] args){
        CIceCream milkIceCream = new CIceCreamCreator().createIceCream();
        WIceCream cinnabonIceCream = new WIceCreamCreator().createIceCream();

        milkIceCream.showInfo();
        System.out.println();
        cinnabonIceCream.showInfo();
    }
}
