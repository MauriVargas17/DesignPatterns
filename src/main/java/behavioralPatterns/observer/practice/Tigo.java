package behavioralPatterns.observer.practice;

import java.util.ArrayList;
import java.util.List;

public class Tigo implements ITelefonia{

    private List<Notification> notifications = new ArrayList<>();
    private List<TelUser> users = new ArrayList<>();

    public void createNotification(String type, String msg){
        Notification n;
        switch(type.toLowerCase()){
            case "prices": n = new Prices(msg); break;
            case "prizes": n = new Prizes(msg); break;
            case "promo": n = new Promo(msg); break;
            default: n = new News(msg); break;
        }
        notifications.add(n);
        notifyUser(n);
    }


    @Override
    public void add(TelUser observer) {
        users.add(observer);
    }

    @Override
    public void remove(TelUser observer) {
        users.remove(observer);
    }

    @Override
    public void notifyUser(Notification notification) {
        int p;

        if (notification instanceof Prices) {p = 0;}
        else if (notification instanceof Promo) {p = 1;}
        else if (notification instanceof Prizes) {p = 2;}
        else {p = 3;}

        for (TelUser iu : users){
            if(iu.getPreferences()[p]){
                iu.update(notification);
            }
        }
    }
}
