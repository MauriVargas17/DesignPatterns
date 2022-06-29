package creationalPatterns.factoryMethod.structure;

public class ConcreteCreator1 extends Creator {

    @Override
    public ConcreteProduct1 factoryMethod() {
        System.out.println("Running concrete creator");
        ConcreteProduct1 product = new ConcreteProduct1();
        /*
         Here we include all the logic of creating a product
         Give values to every attribute of ConcreteProduct1 class
         For instance, ConcreteCreator could be a Fridge creator,
         so that every time we want to create a Fridge in a Client we
         dont need to add values to its attributes every single time.
         */

        return product;
    }
}
