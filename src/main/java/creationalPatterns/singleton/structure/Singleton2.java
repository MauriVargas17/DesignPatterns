package singleton.structure;

import java.util.Date;

public class Singleton2 {

    private static final Singleton2 instance = new Singleton2();

    private Singleton2(){
        System.out.println("Singleton created");
    }

    public static Singleton2 getInstance(){
        return instance;
    }

    public void getTime(){
        System.out.println("time: "+new Date());
    }
}
