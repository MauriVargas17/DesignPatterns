package behavioralPatterns.strategy.practice;

import java.util.List;

public interface ISeason {
    List<Garments> apply(List<Garments> g);
}
