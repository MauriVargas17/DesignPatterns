package singleton.structure;

import java.util.Date;

public class Singleton1 {
    // Attribute of the same type, private and static
    private static Singleton1 instance;

    // Private constructor
    private Singleton1(){
        System.out.println("Singleton created");
    }

    // Public static method for global access
    public static Singleton1 getInstance(){
        // Guarantees that the instance is unique
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public void getTime(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance = null;
    }
}
