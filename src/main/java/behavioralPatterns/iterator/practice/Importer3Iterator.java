package behavioralPatterns.iterator.practice;

import java.util.Vector;

public class Importer3Iterator implements Iterator {
    private int index;
    private Vector<Vehicle> list;
    public Importer3Iterator(Vector<Vehicle> list) {
        this.list = list;
    }

    @Override
    public Vehicle next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        return list.size() > 0 && index < list.size();
    }
}
