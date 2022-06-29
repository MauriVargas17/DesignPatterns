package creationalPatterns.factoryMethod.structure;

public class Client {
    public static void main(String[] args){
        // prod1 might have the same values for its attributes every time
        // so we just let the ConcreteCreator1 create our ConcreteProduct1
        // with the attributes that the ConcreteCreator1 knows for our prod1
        ConcreteProduct1 prod1 = new ConcreteCreator1().factoryMethod();
        prod1.create();
    }
}
