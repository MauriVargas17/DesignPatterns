package creationalPatterns.abstractFactory.structure;

public class Client {
    public static void main(String[] args){

        myProduct(FactoryProduct.make("product 1"));

        FactoryProduct.make("product 2").method1();
        FactoryProduct.make("product 3").method1();

    }
    public static void myProduct(IProduct p){
        p.method1();
        p.method2();
    }
}
