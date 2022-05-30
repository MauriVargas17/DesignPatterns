package behavioralPatterns.iterator.practice;

import java.util.*;

public class Customs {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle(50000, "2022", 5, "Medium");
        Vehicle v2 = v1.clone();
        v2.setCost(34000);
        v2.setModel("2021");
        Vehicle v3 = v1.clone();
        v3.setCost(45670);
        v3.setType("Big");
        Vehicle v4 = v1.clone();
        v4.setNumberOfSeats(7);
        Vehicle v5 = v1.clone();
        v5.setModel("2018");

        Importer1 i1 = new Importer1();
        Importer2 i2 = new Importer2();
        Importer3 i3 = new Importer3();
        Importer4 i4 = new Importer4();

        Iterator iterator1 = i1.createIterator();
        Iterator iterator2 = i2.createIterator();
        Iterator iterator3 = i3.createIterator();
        Iterator iterator4 = i4.createIterator();

        List<Iterator> itList = new ArrayList<>();
        itList.add(iterator1);
        itList.add(iterator2);
        itList.add(iterator3);
        itList.add(iterator4);

        Map<Integer, Vehicle> customs = new HashMap<>();

        i1.add(v1);
        i1.add(v2);
        i1.add(v3);
        i1.add(v4);
        i1.add(v5);

        i2.add(v1);
        i2.add(v2);
        i2.add(v3);
        i2.add(v4);
        i2.add(v5);

        i3.add(v1);
        i3.add(v2);
        i3.add(v3);
        i3.add(v4);
        i3.add(v5);

        i4.add(v1);
        i4.add(v2);
        i4.add(v3);
        i4.add(v4);
        i4.add(v5);

        int index = 1;
        for(Iterator i: itList){
            while(i.hasNext()){
                customs.put(index, i.next());
                index++;
            }
        }
    }
}
