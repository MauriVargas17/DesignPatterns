package behavioralPatterns.iterator.practice;

public class Importer1Iterator implements Iterator{
    private int index;
    private Vehicle[] list;

    public Importer1Iterator(Vehicle[] list) {
        this.list = list;
    }

    @Override
    public Vehicle next() {
        return list[index++];
    }

    @Override
    public boolean hasNext() {
        return list.length > 0 && index < list.length;
    }
}
