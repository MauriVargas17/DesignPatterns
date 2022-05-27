package singleton.structure;

import java.util.Date;

public class Singleton3 {
    // Attribute of the same type, private and static
    private static Singleton3 instance;

    // Private constructor
    private Singleton3(){
        System.out.println("Singleton created");
    }

    // Avoids problems with multi threads
    private synchronized static void multiThreadControl(){
        if (instance == null) instance = new Singleton3();
    }

    // Public static method for global access
    public static Singleton3 getInstance(){
        // Guarantees that the instance is unique
        if (instance == null) multiThreadControl();
        return instance;
    }

    public void getTime(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance = null;
    }
}
