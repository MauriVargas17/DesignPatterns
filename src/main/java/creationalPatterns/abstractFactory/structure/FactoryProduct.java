package creationalPatterns.abstractFactory.structure;

public class FactoryProduct {

    public static IProduct make(String typeProduct){
        IProduct product;
        switch (typeProduct.toLowerCase()){
            case "product 1": product = new ConcreteProduct1(); break;
            case "product 2": product = new ConcreteProduct2(); break;
            default: product = new ConcreteProduct3(); break;
        }
        return product;
    }
}
