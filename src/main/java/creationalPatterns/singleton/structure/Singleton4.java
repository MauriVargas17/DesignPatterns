package singleton.structure;

import java.util.Date;

public class Singleton4 implements Cloneable {
    private static Singleton4 instance;

    private Singleton4(){
        System.out.println("*-*-* Creating singleton .....");
    }


    public static Singleton4 getInstance(){
        if (instance== null)
            instance= new Singleton4();
        return instance;
    }

    public void time(){
        System.out.println("time: "+new Date());
    }

    public void resetSingleton(){
        instance=null;
    }
    // Here we add an exception when trying to clone singleton
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("This is a singleton");
    }
}


