package behavioralPatterns.iterator.practice;

public class Importer1 implements IAggregate{
    private int index;
    private Vehicle[] list;

    public Importer1() {
        list = new Vehicle[5];
    }

    @Override
    public Iterator createIterator() {
        return new Importer1Iterator(list);
    }

    @Override
    public void add(Vehicle vehicle) {
        list[index] = vehicle;
        index++;
    }
}
