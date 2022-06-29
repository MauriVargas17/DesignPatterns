package creationalPatterns.factoryMethod.example;

public class CIceCream implements IIceCream{
    private String size;
    private String shape;
    private Fruit fruit;
    private Base base;
    private Cream cream;

    public CIceCream(Fruit fruit, Base base, Cream cream) {
        this.fruit = fruit;
        this.base = base;
        this.cream = cream;
    }

    @Override
    public void showInfo() {
        System.out.println("This Ice Cream has: ");
        System.out.println("Size: "+size);
        System.out.println("Shape: "+shape);
        System.out.println("Fruit: "+fruit.getInfo());
        System.out.println("Base: "+base.getInfo());
        System.out.println("Cream: "+cream.getInfo());
    }

    public Cream getCream() {
        return cream;
    }

    public void setCream(Cream cream) {
        this.cream = cream;
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
