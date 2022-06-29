package creationalPatterns.factoryMethod.example;

public class WIceCream implements IIceCream{

    private String size;
    private String shape;
    private Fruit fruit;
    private Base base;

    public WIceCream(Fruit fruit, Base base) {
        this.fruit = fruit;
        this.base = base;
    }

    @Override
    public void showInfo() {
        System.out.println("This Ice Cream has: ");
        System.out.println("Size: "+size);
        System.out.println("Shape: "+shape);
        System.out.println("Fruit: "+fruit.getInfo());
        System.out.println("Base: "+base.getInfo());
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
