package behavioralPatterns.iterator.practice;

import java.util.Stack;

public class Importer4Iterator implements Iterator {
    private Stack<Vehicle> list;
    public Importer4Iterator(Stack<Vehicle> list) {
        this.list = list;
    }


    @Override
    public Vehicle next() {
        return list.pop();
    }

    @Override
    public boolean hasNext() {
        return list.size() > 0;
    }
}
