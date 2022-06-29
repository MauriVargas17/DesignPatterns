package creationalPatterns.singleton.structure;

public class Client3Wrong {

    public static void main(String[] args){

        // Example of wrong use of creationalPatterns.singleton with Singleton1:

        Thread user1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton1 s1 = Singleton1.getInstance();
                s1.getTime();
                System.out.println("Singleton 1: " + s1);
                System.out.println("Singleton 1: " + s1.hashCode());
            }
        });

        Thread user2 = new Thread(new Runnable() {
            @Override
            public void run() {
               Singleton1 s2 = Singleton1.getInstance();
               s2.getTime();
               System.out.println("Singleton 2: "+s2);
                System.out.println("Singleton 2: "+s2.hashCode());
            }
        });

        Thread user3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton1 s3 = Singleton1.getInstance();
                s3.getTime();
                System.out.println("Singleton 3: "+s3);
                System.out.println("Singleton 3: "+s3.hashCode());
            }
        });
    /*
    When having concurring threads, calling a creationalPatterns.singleton may cause to create many
    instances of a creationalPatterns.singleton which is not desirable.
    */
        user1.start();
        user2.start();
        user3.start();

        /*
        By executing Client3, we see different instances of a creationalPatterns.singleton,
        it is an error
        */
    }
}
