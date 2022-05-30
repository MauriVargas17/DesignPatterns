package behavioralPatterns.iterator.practice;

import java.util.ArrayList;
import java.util.List;

public class Importer2Iterator implements Iterator{
    private int index;
    private List<Vehicle> list;

    public Importer2Iterator(List<Vehicle> list) {
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
