package behavioralPatterns.iterator.practice;

import java.util.Vector;

public class Importer3 implements IAggregate{
    private int index;
    private Vector<Vehicle> list;

    public Importer3(){
        list = new Vector<>();
    }

    @Override
    public Iterator createIterator() {
        return new Importer3Iterator(list);
    }

    @Override
    public void add(Vehicle vehicle) {
        list.add(vehicle);
    }
}
