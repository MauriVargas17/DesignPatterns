package behavioralPatterns.strategy.practice;

import java.util.List;

public class Spring implements ISeason{

    @Override
    public List<Garments> apply(List<Garments> g) {
        System.out.println("Spring has arrived!");
        System.out.println("Garments keep their prices");
        return g;
    }
}
