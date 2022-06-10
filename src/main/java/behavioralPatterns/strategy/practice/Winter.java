package behavioralPatterns.strategy.practice;

import java.util.List;

public class Winter implements ISeason{

    @Override
    public List<Garments>  apply(List<Garments> g) {
        System.out.println("Winter has arrived!");
        System.out.println("Garments are 10% more expensive");
        for (Garments gar: g){
            gar.setPrice(gar.getPrice() * 1.1);
        }
        return g;
    }
}
