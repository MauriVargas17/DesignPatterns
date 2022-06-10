package behavioralPatterns.strategy.practice;

import java.util.List;

public class Fall implements ISeason{

    @Override
    public List<Garments>  apply(List<Garments> g) {
        System.out.println("Fall has arrived!");
        System.out.println("Garments are 50% off");
        for (Garments gar: g){
            gar.setPrice(gar.getPrice() * 0.5);
        }
        return g;
    }
}
