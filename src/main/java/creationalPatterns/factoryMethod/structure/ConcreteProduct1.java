package creationalPatterns.factoryMethod.structure;

public class ConcreteProduct1 implements IProduct{

    private String att1;
    private String att2;
    private String att3;

    public ConcreteProduct1() {
        System.out.println("Creating product");
    }

    @Override
    public void create() {

    }
}
