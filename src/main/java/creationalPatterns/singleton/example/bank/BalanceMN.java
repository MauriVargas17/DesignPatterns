package creationalPatterns.singleton.example.bank;

public class BalanceMN {
    private static BalanceMN balanceMN;
    private int balance;

    private BalanceMN(){
        balance = 900;
        System.out.println("Current balance: "+balance);
    }

    private synchronized static void multiThreadControl(){
        if (balanceMN == null) balanceMN = new BalanceMN();
    }

    public static BalanceMN getInstance(){
        if (balanceMN == null)
            multiThreadControl();
        return balanceMN;
    }

    public int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int value, String petitioner){
        if (balance >= value) {
            balance-=value;
            System.out.println("Withdrawing: "+value+" - From: "+petitioner+" - Balance: "+balance);
        } else {
            System.out.println("Not enough funds");
        }
    }
}
