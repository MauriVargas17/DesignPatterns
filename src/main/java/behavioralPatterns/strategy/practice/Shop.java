package behavioralPatterns.strategy.practice;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Garments> inventory = new ArrayList<>();
    ISeason season;

    public void changeSeason(){
        setInventory(season.apply(inventory));
        System.out.println("Prices are now: ");
        for (Garments g: inventory){
            System.out.println(g.getType()+": "+g.getPrice());
        }
    }

    public void addGarments(Garments garments){
        inventory.add(garments);
    }

    public List<Garments> getInventory() {
        return inventory;
    }

    private void setInventory(List<Garments> inventory) {
        this.inventory = inventory;
    }

    public ISeason getSeason() {
        return season;
    }

    public void setSeason(ISeason season) {
        this.season = season;
        changeSeason();
    }
}
