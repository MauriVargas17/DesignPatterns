package singleton.structure;

public class Client1 {

    public static void main(String[] args){

        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();
        Singleton1 s3 = Singleton1.getInstance();

        //Proving that there is only one global instance of Singleton1
        System.out.println("Singleton 1: "+s1);
        System.out.println("Singleton 2: "+s2);
        System.out.println("Singleton 3: "+s3);

        Singleton1.getInstance().getTime();
        Singleton1.getInstance().getTime();
        Singleton1.getInstance().getTime();
        Singleton1.getInstance().getTime();
        Singleton1.getInstance().resetSingleton();
        Singleton1.getInstance().getTime();
        Singleton1.getInstance().getTime();
        Singleton1.getInstance().getTime();
        Singleton1.getInstance().getTime();
    }
}
