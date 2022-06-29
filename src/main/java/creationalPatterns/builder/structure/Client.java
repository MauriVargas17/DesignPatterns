package creationalPatterns.builder.structure;

public class Client {
    /*
    * This DP is when for a product, there are many ways
    * to create it, therefore more than 1 concreteBuilder
    * for just one same product.
    */
    public static void main(String[] args){
        Director dir = new Director();
        ConcreteBuilder1 p1 = new ConcreteBuilder1();
        ConcreteBuilder2 p2 = new ConcreteBuilder2();
        // Using director
        dir.setBuilder(p2);
        dir.buildProduct();
        Product product = dir.getProduct();
        product.showInfo();
        // Without director and using setters with return
        Product p3 = new Product();
        p3.setAttribute1("");
        p3.setAttribute1("").setAttribute2("");
        p3.setAttribute1("").setAttribute2("").setAttribute3("");
        // We made a dynamic constructor for Product

    }
}
