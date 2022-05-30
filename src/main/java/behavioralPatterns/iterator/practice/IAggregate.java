package behavioralPatterns.iterator.practice;

public interface IAggregate {
    Iterator createIterator();
    void add(Vehicle vehicle);
}
