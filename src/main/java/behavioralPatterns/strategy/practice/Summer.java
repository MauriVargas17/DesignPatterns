package behavioralPatterns.strategy.practice;

import java.util.List;

public class Summer implements ISeason{

    @Override
    public List<Garments>  apply(List<Garments> g) {
        System.out.println("Summer has arrived!");
        System.out.println("Garments are 10% off");
        for (Garments gar: g){
            gar.setPrice(gar.getPrice() * 0.9);
        }
        return g;
    }
}
