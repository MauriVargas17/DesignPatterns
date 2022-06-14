package behavioralPatterns.iterator.structure;

public class ConcreteIteratorA implements MyIterator{
    private int position;
    private String[] nameList;

    public ConcreteIteratorA(String[] nameList){
        this.nameList=nameList;
    }

    @Override
    public Object next() {
        return nameList[position++];
    }

    @Override
    public boolean hasNext() {
        return nameList.length != 0 && position < nameList.length;
    }
}