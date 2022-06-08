package behavioralPatterns.observer.practice;

public class Client {
    public static void main(String[] args){
        Tigo tigo = new Tigo();
        TelUser t1 = new TelUser("Bob", new boolean[]{false, true, true, false});
        TelUser t2 = new TelUser("John", new boolean[]{false, false, false, true});
        TelUser t3 = new TelUser("Oscar", new boolean[]{true, true, true, true});

        tigo.add(t1);
        tigo.add(t2);
        tigo.add(t3);

        tigo.createNotification("prizes", "--> We are giving 2000 cash away");
        tigo.createNotification("promo", "--> This month calls overseas are free!");
        tigo.createNotification("news", "--> Elon Musk buys Twitter");
        tigo.createNotification("prices", "--> Price per minute for any call is now $2");
        tigo.createNotification("promo", "--> Buy one phone get one free");
        tigo.createNotification("prizes", "--> Dont miss on this new giveaway of iPhones");
        tigo.createNotification("news", "--> League of Nations is now streaming on Star Plus");


    }
}
