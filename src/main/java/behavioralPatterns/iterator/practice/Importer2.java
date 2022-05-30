package behavioralPatterns.iterator.practice;

import java.util.ArrayList;
import java.util.List;

public class Importer2 implements IAggregate{
    private int index;
    private List<Vehicle> list;

    public Importer2() {
        list = new ArrayList<>();
    }

    @Override
    public Iterator createIterator() {
        return new Importer2Iterator(list);
    }

    @Override
    public void add(Vehicle vehicle) {
        list.add(vehicle);
    }
}
