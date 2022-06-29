package creationalPatterns.singleton.example.bank;

public class BankClient {

    public static void main(String[] args){

    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            ATM atm = new ATM();
            atm.withdraw(200, 9);
        }
    });

    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            Online online = new Online();
            online.withdraw(100, 9);
        }
    });

    Thread t3 = new Thread(new Runnable() {
        @Override
        public void run() {
            Branch branch = new Branch();
            branch.withdraw(300, 9);
        }
    });

        t1.start();
        t2.start();
        t3.start();
    }
}
