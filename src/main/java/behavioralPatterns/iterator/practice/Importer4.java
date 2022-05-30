package behavioralPatterns.iterator.practice;

import java.util.Stack;

public class Importer4 implements IAggregate{
    private Stack<Vehicle> list;

    public Importer4(){
        list = new Stack<>();
    }

    @Override
    public Iterator createIterator() {
        return new Importer4Iterator(list);
    }

    @Override
    public void add(Vehicle vehicle) {
        list.push(vehicle);
    }
}
